package com.modified.modifiedadditions.listeners;

import com.modified.modifiedadditions.abilities.ChiselAbilities;
import com.modified.modifiedadditions.permissions.ChiselPermissions;
import org.bukkit.event.EventPriority;
import org.bukkit.event.EventHandler;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import com.chrismin13.additionsapi.items.CustomItem;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockBreakEvent;
import com.chrismin13.additionsapi.items.CustomItemStack;
import com.chrismin13.additionsapi.utils.PermissionUtils;
import com.chrismin13.additionsapi.events.item.CustomItemBlockBreakEvent;
import org.bukkit.event.Listener;

public class ChiselListener implements Listener
{
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockBreak(CustomItemBlockBreakEvent customItemBlockBreakEvent) {
        if (customItemBlockBreakEvent.isCancelled()) {
            return;
        }
        CustomItemStack customItemStack = customItemBlockBreakEvent.getCustomItemStack();
        if (!(customItemStack.getCustomItem() instanceof ChiselAbilities)) {
            return;
        }
        BlockBreakEvent blockBreakEvent = customItemBlockBreakEvent.getBlockBreakEvent();
        Block block = blockBreakEvent.getBlock();
        CustomItem customItem = customItemStack.getCustomItem();
        ChiselAbilities chiselAbilities = (ChiselAbilities)customItem;
        if (!(customItem.getPermissions() instanceof ChiselPermissions)) {
            return;
        }
        ChiselPermissions chiselPermissions = (ChiselPermissions)customItem.getPermissions();
        Player player = blockBreakEvent.getPlayer();
        if (!PermissionUtils.allowedAction(player, chiselPermissions.getType(), chiselPermissions.getChisel())) {
            return;
        }
        blockBreakEvent.setCancelled(true);
        Material type = block.getType();
        byte data = block.getData();
        chiselAbilities.convertToChiseled(block);
        if (!block.getType().equals((Object)type) || data != block.getData()) {
            customItemStack.reduceDurability(player, 1);
        }
    }
}

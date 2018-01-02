package com.modified.modifiedadditions.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import com.chrismin13.additionsapi.items.CustomItemStack;
import com.chrismin13.additionsapi.items.CustomItem;
import com.modified.modifiedadditions.abilities.SickleAbilities;
import org.bukkit.Material;
import com.modified.modifiedadditions.abilities.DoubleAxeAbilities;
import com.chrismin13.additionsapi.events.item.CustomItemBlockBreakEvent;
import org.bukkit.event.Listener;

public class BlockBreakListener implements Listener
{
    @EventHandler
    public void onCustomItemBlockBreak(CustomItemBlockBreakEvent customItemBlockBreakEvent) {
        if (customItemBlockBreakEvent.isCancelled()) {
            return;
        }
        CustomItem customItem = customItemBlockBreakEvent.getCustomItem();
        CustomItemStack customItemStack = customItemBlockBreakEvent.getCustomItemStack();
        BlockBreakEvent blockBreakEvent = customItemBlockBreakEvent.getBlockBreakEvent();
        Player player = blockBreakEvent.getPlayer();
        Block block = blockBreakEvent.getBlock();
        if (customItem instanceof DoubleAxeAbilities && (block.getType().equals((Object)Material.LOG) || block.getType().equals((Object)Material.LOG_2))) {
            ((DoubleAxeAbilities)customItem).chopTree(player, block, customItemStack);
        }
        else if (customItem instanceof SickleAbilities) {
            ((SickleAbilities)customItem).onUse(customItemStack, block, player);
        }
    }
}

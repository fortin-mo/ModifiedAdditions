package com.modified.modifiedadditions.listeners;

import com.modified.modifiedadditions.items.netherrack.NetherrackHoe;
import com.modified.modifiedadditions.items.netherrack.NetherrackItem;
import com.modified.modifiedadditions.items.netherrack.NetherrackShovel;
import org.bukkit.event.EventPriority;
import org.bukkit.entity.Entity;
import com.chrismin13.additionsapi.utils.NumberUtils;
import com.modified.modifiedadditions.items.netherrack.NetherrackArmor;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.EventHandler;
import com.chrismin13.additionsapi.items.CustomItem;
import org.bukkit.inventory.ItemStack;
import org.bukkit.entity.Player;
import org.bukkit.block.Block;
import org.bukkit.Sound;
import org.bukkit.event.Event;
import org.bukkit.Bukkit;
import com.chrismin13.additionsapi.events.item.CustomItemBlockIgniteEvent;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.block.BlockFace;
import com.chrismin13.additionsapi.items.CustomItemStack;
import com.chrismin13.additionsapi.AdditionsAPI;
import org.bukkit.Material;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.Listener;

public class NetherrackItemsListener implements Listener
{
    @EventHandler
    public void onRightClickBlock(PlayerInteractEvent playerInteractEvent) {
        if (playerInteractEvent.isCancelled() || !playerInteractEvent.getAction().equals((Object)Action.RIGHT_CLICK_BLOCK)) {
            return;
        }
        Block clickedBlock = playerInteractEvent.getClickedBlock();
        BlockFace blockFace = playerInteractEvent.getBlockFace();
        Block relative = playerInteractEvent.getClickedBlock().getRelative(blockFace);
        if (relative == null || relative.getType() == null || relative.getType() != Material.AIR) {
            return;
        }
        Player player = playerInteractEvent.getPlayer();
        ItemStack itemInMainHand = player.getInventory().getItemInMainHand();
        if (!AdditionsAPI.isCustomItem(itemInMainHand)) {
            return;
        }
        CustomItemStack customItemStack = new CustomItemStack(itemInMainHand);
        CustomItem customItem = customItemStack.getCustomItem();
        if (!(customItem instanceof NetherrackItem)) {
            return;
        }
        Material type = clickedBlock.getType();
        Byte value = clickedBlock.getData();
        if (blockFace == BlockFace.UP || blockFace == BlockFace.EAST || blockFace == BlockFace.NORTH || blockFace == BlockFace.SOUTH || blockFace == BlockFace.WEST) {
            if (customItem instanceof NetherrackShovel && type == Material.GRASS) {
                return;
            }
            if (customItem instanceof NetherrackHoe && (type == Material.GRASS || type == Material.GRASS_PATH || (type == Material.DIRT && value != 2))) {
                return;
            }
        }
        CustomItemBlockIgniteEvent customItemBlockIgniteEvent = new CustomItemBlockIgniteEvent(new BlockIgniteEvent(clickedBlock, BlockIgniteEvent.IgniteCause.FLINT_AND_STEEL, relative), customItemStack);
        Bukkit.getPluginManager().callEvent((Event)customItemBlockIgniteEvent);
        if (!customItemBlockIgniteEvent.isCancelled()) {
            relative.setType(Material.FIRE);
            relative.setData((byte)0);
            player.playSound(relative.getLocation(), Sound.ITEM_FLINTANDSTEEL_USE, 1.0f, 1.0f);
            customItemStack.reduceDurability(player, 1);
        }
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onEnemyHit(EntityDamageByEntityEvent entityDamageByEntityEvent) {
        if (entityDamageByEntityEvent.isCancelled()) {
            return;
        }
        if (!(entityDamageByEntityEvent.getEntity() instanceof Player)) {
            return;
        }
        Player player = (Player)entityDamageByEntityEvent.getEntity();
        Entity damager = entityDamageByEntityEvent.getDamager();
        ItemStack[] armorContents;
        for (int length = (armorContents = player.getInventory().getArmorContents()).length, i = 0; i < length; ++i) {
            ItemStack itemStack = armorContents[i];
            if (AdditionsAPI.isCustomItem(itemStack) && new CustomItemStack(itemStack).getCustomItem() instanceof NetherrackArmor && NumberUtils.calculateChance(0.05)) {
                damager.setFireTicks(NumberUtils.randomInt(40, 120));
                break;
            }
        }
    }
}

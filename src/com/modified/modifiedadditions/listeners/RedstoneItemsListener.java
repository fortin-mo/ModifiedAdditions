// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.listeners;

import com.modified.modifiedadditions.ModifiedAdditions;
import com.modified.modifiedadditions.items.redstone.RedstoneArmor;
import org.bukkit.event.EventPriority;
import org.bukkit.potion.PotionEffect;
import com.chrismin13.additionsapi.utils.NumberUtils;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.block.BlockRedstoneEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.block.Action;
import com.chrismin13.additionsapi.items.CustomItemStack;
import com.modified.modifiedadditions.items.redstone.RedstoneItem;
import com.chrismin13.additionsapi.AdditionsAPI;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.block.Block;
import java.util.ArrayList;
import org.bukkit.event.Listener;

public class RedstoneItemsListener implements Listener
{
    private ArrayList<Block> blocks;
    private ArrayList<String> cooldown;
    
    public RedstoneItemsListener() {
        this.blocks = new ArrayList<Block>();
        this.cooldown = new ArrayList<String>();
    }
    
    @EventHandler
    public void onPlayerInteract( PlayerInteractEvent playerInteractEvent) {
        if (playerInteractEvent.isCancelled()) {
            return;
        }
         Player player = playerInteractEvent.getPlayer();
         PlayerInventory inventory = player.getInventory();
        ItemStack itemStack = inventory.getItemInMainHand();
        if (!AdditionsAPI.isCustomItem(itemStack) || !(new CustomItemStack(itemStack).getCustomItem() instanceof RedstoneItem)) {
            itemStack = inventory.getItemInOffHand();
            if (!AdditionsAPI.isCustomItem(itemStack) || !(new CustomItemStack(itemStack).getCustomItem() instanceof RedstoneItem)) {
                return;
            }
        }
         CustomItemStack customItemStack = new CustomItemStack(itemStack);
        if (!(customItemStack.getCustomItem() instanceof RedstoneItem)) {
            return;
        }
        if (!playerInteractEvent.getAction().equals((Object)Action.RIGHT_CLICK_BLOCK)) {
            return;
        }
         Block clickedBlock = playerInteractEvent.getClickedBlock();
         String string = String.valueOf(clickedBlock.getWorld().getName()) + ";" + clickedBlock.getX() + ";" + clickedBlock.getY() + ";" + clickedBlock.getZ();
        if (this.cooldown.contains(string)) {
            return;
        }
        if (clickedBlock.getType() == Material.REDSTONE_LAMP_OFF) {
            Block block = clickedBlock.getLocation().add(0.0, -1.0, 0.0).getBlock();
            if (!block.getState().getClass().getName().endsWith("CraftBlockState")) {
                block = clickedBlock.getLocation().add(0.0, -1.0, 0.0).getBlock();
            }
            if (!block.getState().getClass().getName().endsWith("CraftBlockState")) {
                block = clickedBlock.getLocation().add(1.0, 0.0, 0.0).getBlock();
            }
            if (!block.getState().getClass().getName().endsWith("CraftBlockState")) {
                block = clickedBlock.getLocation().add(-1.0, 0.0, 0.0).getBlock();
            }
            if (!block.getState().getClass().getName().endsWith("CraftBlockState")) {
                block = clickedBlock.getLocation().add(0.0, 0.0, 1.0).getBlock();
            }
            if (!block.getState().getClass().getName().endsWith("CraftBlockState")) {
                block = clickedBlock.getLocation().add(0.0, 0.0, -1.0).getBlock();
            }
            if (!block.getState().getClass().getName().endsWith("CraftBlockState")) {
                return;
            }
             Block block2 = block;
            Material type = block2.getType();
            Byte data = block2.getData();
            block2.setType(Material.REDSTONE_BLOCK);
            this.blocks.add(clickedBlock);
            Bukkit.getScheduler().runTask((Plugin) ModifiedAdditions.getInstance(), () -> {
            	block2.setType(type);
            	block2.setData(data);
                return;
            });
        }
        else {
            if (!clickedBlock.getType().equals((Object)Material.REDSTONE_LAMP_ON)) {
                return;
            }
            clickedBlock.setType(Material.REDSTONE_LAMP_OFF);
        }
        this.cooldown.add(string);
        customItemStack.reduceDurability(player, 1);
        Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin) ModifiedAdditions.getInstance(), () -> this.cooldown.remove(string), 20L);
    }
    
    @EventHandler
    public void onBlockRedstone( BlockRedstoneEvent blockRedstoneEvent) {
        if (!this.blocks.contains(blockRedstoneEvent.getBlock())) {
            return;
        }
        blockRedstoneEvent.setNewCurrent(1);
        this.blocks.remove(blockRedstoneEvent.getBlock());
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onEnemyHit( EntityDamageByEntityEvent entityDamageByEntityEvent) {
        if (entityDamageByEntityEvent.isCancelled()) {
            return;
        }
        if (!(entityDamageByEntityEvent.getEntity() instanceof Player)) {
            return;
        }
         Player player = (Player)entityDamageByEntityEvent.getEntity();
        if (!player.hasPotionEffect(PotionEffectType.REGENERATION)) {
            ItemStack[] armorContents;
            for (int length = (armorContents = player.getInventory().getArmorContents()).length, i = 0; i < length; ++i) {
                 ItemStack itemStack = armorContents[i];
                if (AdditionsAPI.isCustomItem(itemStack) && new CustomItemStack(itemStack).getCustomItem() instanceof RedstoneArmor && NumberUtils.calculateChance(0.05)) {
                    player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, NumberUtils.randomInt(150, 250), 1));
                    break;
                }
            }
        }
    }
}

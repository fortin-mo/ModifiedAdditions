// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.listeners;

import org.bukkit.event.EventPriority;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.EventHandler;
import java.util.List;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import com.modified.modifiedadditions.Items;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.Listener;

public class ArmorStandListener implements Listener
{
    @EventHandler
    public void onArmorStandPlace(CreatureSpawnEvent creatureSpawnEvent) {
        List stringList = Items.config.getStringList("enabled-mechanics");
        if (creatureSpawnEvent.isCancelled() || !creatureSpawnEvent.getEntityType().equals((Object)EntityType.ARMOR_STAND) || !stringList.contains("ARMOR_STANDS_WITH_ARMS")) {
            return;
        }
        ArmorStand armorStand = (ArmorStand)creatureSpawnEvent.getEntity();
        if (!armorStand.hasArms()) {
            armorStand.setArms(true);
        }
    }
    
    @EventHandler(priority = EventPriority.MONITOR)
    public void onArmorStandItemAdd(PlayerInteractAtEntityEvent playerInteractAtEntityEvent) {
        List stringList = Items.config.getStringList("enabled-mechanics");
        if (playerInteractAtEntityEvent.isCancelled() || !stringList.contains("ARMOR_STAND_ITEM_IN_OFF_HAND") || !playerInteractAtEntityEvent.getRightClicked().getType().equals((Object)EntityType.ARMOR_STAND) || playerInteractAtEntityEvent.getHand() == null || !playerInteractAtEntityEvent.getHand().equals((Object)EquipmentSlot.HAND)) {
            return;
        }
        ArmorStand armorStand = (ArmorStand)playerInteractAtEntityEvent.getRightClicked();
        if (!armorStand.hasArms()) {
            return;
        }
        EntityEquipment equipment = armorStand.getEquipment();
        ItemStack itemInOffHand = equipment.getItemInOffHand();
        PlayerInventory inventory = playerInteractAtEntityEvent.getPlayer().getInventory();
        ItemStack itemInOffHand2 = inventory.getItemInOffHand();
        if (itemInOffHand.getType().equals((Object)Material.AIR) && !itemInOffHand2.equals((Object)Material.AIR)) {
            if (itemInOffHand2.getAmount() == 1) {
                equipment.setItemInOffHand(itemInOffHand2);
                inventory.setItemInOffHand((ItemStack)null);
            }
            else if (itemInOffHand2.getAmount() > 1) {
                ItemStack clone = itemInOffHand2.clone();
                itemInOffHand2.setAmount(itemInOffHand2.getAmount() - 1);
                clone.setAmount(1);
                equipment.setItemInOffHand(clone);
            }
        }
        else if (!itemInOffHand.getType().equals((Object)Material.AIR) && itemInOffHand2.getType().equals((Object)Material.AIR)) {
            inventory.setItemInOffHand(itemInOffHand);
            equipment.setItemInOffHand((ItemStack)null);
        }
        else if (!itemInOffHand.getType().equals((Object)Material.AIR) && !itemInOffHand2.getType().equals((Object)Material.AIR) && itemInOffHand2.getAmount() == 1) {
            ItemStack clone2 = itemInOffHand2.clone();
            inventory.setItemInOffHand(itemInOffHand);
            equipment.setItemInOffHand(clone2);
        }
    }
}

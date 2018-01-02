// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import com.chrismin13.additionsapi.utils.NumberUtils;
import com.chrismin13.additionsapi.AdditionsAPI;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.Listener;

public class CoalItemsListener implements Listener
{
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent playerMoveEvent) {
        if (playerMoveEvent.isCancelled()) {
            return;
        }
        Player player = playerMoveEvent.getPlayer();
        PlayerInventory inventory = player.getInventory();
        if (!player.hasPotionEffect(PotionEffectType.BLINDNESS)) {
            ItemStack[] armorContents;
            for (int length = (armorContents = inventory.getArmorContents()).length, i = 0; i < length; ++i) {
                ItemStack itemStack = armorContents[i];
                if (AdditionsAPI.isCustomItem(itemStack) && AdditionsAPI.getIdName(itemStack).contains("modified_additions:coal_") && NumberUtils.calculateChance(0.005)) {
                    player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 60, 0), false);
                    return;
                }
            }
        }
    }
}

package com.modified.modifiedadditions.listeners;

import java.util.Map;

import com.modified.modifiedadditions.ModifiedAdditions;
import com.modified.modifiedadditions.items.lapis.LapisArmor;
import com.modified.modifiedadditions.items.lapis.LapisItem;
import org.bukkit.plugin.Plugin;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.EnchantingInventory;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.enchantments.EnchantmentOffer;
import org.bukkit.inventory.ItemStack;
import com.chrismin13.additionsapi.items.CustomItemStack;
import com.chrismin13.additionsapi.AdditionsAPI;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;
import org.bukkit.event.Listener;

public class LapisItemsListener implements Listener
{
    @EventHandler
    public void onPrepareItemEnchant( PrepareItemEnchantEvent prepareItemEnchantEvent) {
        if (prepareItemEnchantEvent.isCancelled()) {
            return;
        }
         ItemStack item = prepareItemEnchantEvent.getItem();
        if (!AdditionsAPI.isCustomItem(item)) {
            return;
        }
         CustomItemStack customItemStack = new CustomItemStack(item);
        if (!(customItemStack.getCustomItem() instanceof LapisItem) && !(customItemStack.getCustomItem() instanceof LapisArmor)) {
            return;
        }
         EnchantmentOffer[] offers = prepareItemEnchantEvent.getOffers();
        for (int i = 0; i < offers.length; ++i) {
             EnchantmentOffer enchantmentOffer = offers[i];
            if (enchantmentOffer != null && enchantmentOffer.getEnchantment() != null && enchantmentOffer.getEnchantment().getMaxLevel() > 1) {
                enchantmentOffer.setEnchantmentLevel(enchantmentOffer.getEnchantmentLevel() + 1);
            }
        }
    }
    
    @EventHandler
    public void onItemEnchant(EnchantItemEvent enchantItemEvent) {
        if (enchantItemEvent.isCancelled()) {
            return;
        }
        ItemStack item = enchantItemEvent.getItem();
        if (!AdditionsAPI.isCustomItem(item)) {
            return;
        }
        CustomItemStack customItemStack = new CustomItemStack(item);
        if (!(customItemStack.getCustomItem() instanceof LapisItem) && !(customItemStack.getCustomItem() instanceof LapisArmor)) {
            return;
        }
        Map<Enchantment, Integer> enchantsToAdd = enchantItemEvent.getEnchantsToAdd();
        for (Enchantment enchantment : enchantsToAdd.keySet()) {
            if (enchantment.getMaxLevel() > 1) {
                enchantsToAdd.put(enchantment, (int)enchantsToAdd.get(enchantment) + 1);
            }
        }
        if (enchantItemEvent.getInventory() instanceof EnchantingInventory) {
            EnchantingInventory enchantingInventory = (EnchantingInventory)enchantItemEvent.getInventory();
            if (enchantingInventory.getSecondary() != null) {
                ItemStack secondary = enchantingInventory.getSecondary();
                if (!secondary.getType().equals((Object)Material.INK_SACK) || !secondary.getData().equals((Object)(byte)4)) {
                    Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin) ModifiedAdditions.getInstance(), () -> secondary.setAmount(secondary.getAmount()));
                }
            }
        }
    }
}

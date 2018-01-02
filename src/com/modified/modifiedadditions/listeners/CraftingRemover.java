// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.listeners;

import org.bukkit.event.EventPriority;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.Recipe;
import com.chrismin13.additionsapi.items.CustomItemStack;
import com.modified.modifiedadditions.utils.MaterialUtils;
import org.bukkit.inventory.ItemStack;
import com.chrismin13.additionsapi.AdditionsAPI;
import org.bukkit.Material;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.Listener;

public class CraftingRemover implements Listener
{
    @EventHandler(priority = EventPriority.LOWEST)
    public void onPrepareCrafting(PrepareItemCraftEvent prepareItemCraftEvent) {
        Recipe recipe = prepareItemCraftEvent.getRecipe();
        if (recipe == null || recipe.getResult() == null) {
            return;
        }
        Material type = recipe.getResult().getType();
        CraftingInventory inventory = prepareItemCraftEvent.getInventory();
        ItemStack[] contents = inventory.getContents();
        if ((type.equals((Object)Material.WOOD_SWORD) || type.equals((Object)Material.WOOD_AXE) || type.equals((Object)Material.WOOD_PICKAXE) || type.equals((Object)Material.WOOD_SPADE) || type.equals((Object)Material.WOOD_HOE)) && !AdditionsAPI.isCustomItem(inventory.getResult())) {
            Byte value = null;
            for (int i = 0; i < 8; ++i) {
                if (contents[i] != null && contents[i].getType().equals((Object)Material.WOOD)) {
                    if (value == null) {
                        value = contents[i].getData().getData();
                    }
                    else if (!value.equals(contents[i].getData().getData())) {
                        inventory.setResult(new ItemStack(Material.AIR));
                        return;
                    }
                }
            }
            if (value == null) {
                return;
            }
            inventory.setResult(new CustomItemStack("modified_additions:" + MaterialUtils.getWoodType(value) + "_" + type.toString().toLowerCase().replace("wood", "wooden").replace("spade", "shovel")).getItemStack());
        }
    }
}

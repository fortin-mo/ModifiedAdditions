// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.lapis;

import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class LapisPickaxe extends LapisItem
{
    public LapisPickaxe() {
        super(DamageableItem.IRON_PICKAXE, "modified_additions:lapis_pickaxe", "Lapis Pickaxe", "lapis_pickaxe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(new RecipeIngredient(Material.INK_SACK, (byte)4), new RecipeIngredient(Material.STICK)));
    }
}

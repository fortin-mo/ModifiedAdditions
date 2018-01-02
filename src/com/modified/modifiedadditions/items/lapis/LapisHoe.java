// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.lapis;

import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class LapisHoe extends LapisItem
{
    public LapisHoe() {
        super(DamageableItem.IRON_HOE, "modified_additions:lapis_hoe", "Lapis Hoe", "lapis_hoe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(new RecipeIngredient(Material.INK_SACK, (byte)4), new RecipeIngredient(Material.STICK)));
    }
}

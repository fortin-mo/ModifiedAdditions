// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.lapis;

import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class LapisSword extends LapisItem
{
    public LapisSword() {
        super(DamageableItem.IRON_SWORD, "modified_additions:lapis_sword", "Lapis Sword", "lapis_sword");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(new RecipeIngredient(Material.INK_SACK, (byte)4), new RecipeIngredient(Material.STICK)));
    }
}

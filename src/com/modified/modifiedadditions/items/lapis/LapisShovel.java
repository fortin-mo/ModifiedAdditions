// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.lapis;

import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class LapisShovel extends LapisItem
{
    public LapisShovel() {
        super(DamageableItem.IRON_SHOVEL, "modified_additions:lapis_shovel", "Lapis Shovel", "lapis_shovel");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(new RecipeIngredient(Material.INK_SACK, (byte)4), new RecipeIngredient(Material.STICK)));
    }
}

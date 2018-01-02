// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.wood;

import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;
import com.modified.modifiedadditions.items.AverageTexturedTool;

public class WoodBasedItem extends AverageTexturedTool
{
    public WoodBasedItem(final DamageableItem damageableItem, final byte b, final String s, final String s2, final String s3, final String s4) {
        super(damageableItem, 59, "modified_additions:" + s + "_" + s4, s3, s2);
    }
    
    public WoodBasedItem(final DamageableItem damageableItem, final byte b, final String s, final String s2, final String s3) {
        super(damageableItem, 59, "modified_additions:" + s + "_" + damageableItem.toString().toLowerCase(), s3, s2);
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(new RecipeIngredient(Material.WOOD, b), new RecipeIngredient(Material.STICK)));
    }
}

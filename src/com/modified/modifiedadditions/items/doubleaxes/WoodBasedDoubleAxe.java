// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.doubleaxes;

import com.chrismin13.additionsapi.items.CustomTool;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import com.modified.modifiedadditions.abilities.DoubleAxeAbilities;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;
import com.modified.modifiedadditions.items.wood.WoodBasedItem;

public class WoodBasedDoubleAxe extends WoodBasedItem implements DoubleAxeAbilities
{
    public WoodBasedDoubleAxe(final byte b, final String s, final String s2, final String s3) {
        super(DamageableItem.WOODEN_AXE, b, s, s2, s3, "wooden_double_axe");
        this.modifyCustomItem((CustomTool)this, new RecipeIngredient(Material.WOOD, b));
    }
}

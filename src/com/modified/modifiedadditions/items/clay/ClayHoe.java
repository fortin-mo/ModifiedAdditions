// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.clay;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class ClayHoe extends ClayItem
{
    public ClayHoe() {
        super(DamageableItem.WOODEN_HOE, "modified_additions:clay_hoe", "Clay Hoe", "clay_hoe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.CLAY_BALL, Material.STICK));
    }
}

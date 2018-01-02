// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.clay;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class ClayShovel extends ClayItem
{
    public ClayShovel() {
        super(DamageableItem.WOODEN_SHOVEL, "modified_additions:clay_shovel", "Clay Shovel", "clay_shovel");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.CLAY_BALL, Material.STICK));
    }
}

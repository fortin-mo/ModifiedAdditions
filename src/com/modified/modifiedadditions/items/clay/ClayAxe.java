// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.clay;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class ClayAxe extends ClayItem
{
    public ClayAxe() {
        super(DamageableItem.WOODEN_AXE, "modified_additions:clay_axe", "Clay Axe", "clay_axe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.CLAY_BALL, Material.STICK));
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.clay;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class ClaySword extends ClayItem
{
    public ClaySword() {
        super(DamageableItem.WOODEN_SWORD, "modified_additions:clay_sword", "Clay Sword", "clay_sword");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.CLAY_BALL, Material.STICK));
    }
}

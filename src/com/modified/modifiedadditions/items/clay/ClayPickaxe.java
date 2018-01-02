// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.clay;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class ClayPickaxe extends ClayItem
{
    public ClayPickaxe() {
        super(DamageableItem.WOODEN_PICKAXE, "modified_additions:clay_pickaxe", "Clay Pickaxe", "clay_pickaxe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.CLAY_BALL, Material.STICK));
    }
}

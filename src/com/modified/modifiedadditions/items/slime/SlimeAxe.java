// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.slime;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class SlimeAxe extends SlimeItem
{
    public SlimeAxe() {
        super(DamageableItem.WOODEN_AXE, "modified_additions:slime_axe", "Slime Axe", "slime_axe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.SLIME_BALL, Material.STICK));
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.slime;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class SlimeHoe extends SlimeItem
{
    public SlimeHoe() {
        super(DamageableItem.WOODEN_HOE, "modified_additions:slime_hoe", "Slime Hoe", "slime_hoe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.SLIME_BALL, Material.STICK));
    }
}

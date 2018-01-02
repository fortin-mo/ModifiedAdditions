// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.slime;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class SlimeShovel extends SlimeItem
{
    public SlimeShovel() {
        super(DamageableItem.WOODEN_SHOVEL, "modified_additions:slime_shovel", "Slime Shovel", "slime_shovel");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.SLIME_BALL, Material.STICK));
    }
}

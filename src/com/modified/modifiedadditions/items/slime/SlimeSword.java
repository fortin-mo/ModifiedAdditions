// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.slime;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class SlimeSword extends SlimeItem
{
    public SlimeSword() {
        super(DamageableItem.WOODEN_SWORD, "modified_additions:slime_sword", "Slime Sword", "slime_sword");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.SLIME_BALL, Material.STICK));
    }
}

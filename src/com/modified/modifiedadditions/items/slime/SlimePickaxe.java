// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.slime;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class SlimePickaxe extends SlimeItem
{
    public SlimePickaxe() {
        super(DamageableItem.WOODEN_PICKAXE, "modified_additions:slime_pickaxe", "Slime Pickaxe", "slime_pickaxe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.SLIME_BALL, Material.STICK));
    }
}

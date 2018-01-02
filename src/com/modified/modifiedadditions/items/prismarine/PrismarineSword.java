// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.prismarine;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class PrismarineSword extends PrismarineItem
{
    public PrismarineSword() {
        super(DamageableItem.DIAMOND_SWORD, "modified_additions:prismarine_sword", "Prismarine Sword", "prismarine_sword");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.PRISMARINE_SHARD, Material.STICK));
    }
}

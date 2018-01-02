// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.prismarine;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class PrismarineShovel extends PrismarineItem
{
    public PrismarineShovel() {
        super(DamageableItem.DIAMOND_SHOVEL, "modified_additions:prismarine_shovel", "Prismarine Shovel", "prismarine_shovel");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.PRISMARINE_SHARD, Material.STICK));
    }
}

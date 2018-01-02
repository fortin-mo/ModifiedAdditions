// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.prismarine;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class PrismarineHoe extends PrismarineItem
{
    public PrismarineHoe() {
        super(DamageableItem.DIAMOND_HOE, "modified_additions:prismarine_hoe", "Prismarine Hoe", "prismarine_hoe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.PRISMARINE_SHARD, Material.STICK));
    }
}

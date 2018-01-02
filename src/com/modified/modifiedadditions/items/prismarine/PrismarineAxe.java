// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.prismarine;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class PrismarineAxe extends PrismarineItem
{
    public PrismarineAxe() {
        super(DamageableItem.DIAMOND_AXE, "modified_additions:prismarine_axe", "Prismarine Axe", "prismarine_axe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.PRISMARINE_SHARD, Material.STICK));
    }
}

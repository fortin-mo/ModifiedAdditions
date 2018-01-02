// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.prismarine;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class PrismarinePickaxe extends PrismarineItem
{
    public PrismarinePickaxe() {
        super(DamageableItem.DIAMOND_PICKAXE, "modified_additions:prismarine_pickaxe", "Prismarine Pickaxe", "prismarine_pickaxe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.PRISMARINE_SHARD, Material.STICK));
    }
}

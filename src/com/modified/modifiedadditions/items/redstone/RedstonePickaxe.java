// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.redstone;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class RedstonePickaxe extends RedstoneItem
{
    public RedstonePickaxe() {
        super(DamageableItem.STONE_PICKAXE, "modified_additions:redstone_pickaxe", "Redstone Pickaxe", "redstone_pickaxe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.REDSTONE, Material.STICK));
    }
}

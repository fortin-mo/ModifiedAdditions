// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.redstone;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class RedstoneHoe extends RedstoneItem
{
    public RedstoneHoe() {
        super(DamageableItem.STONE_HOE, "modified_additions:redstone_hoe", "Redstone Hoe", "redstone_hoe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.REDSTONE, Material.STICK));
    }
}

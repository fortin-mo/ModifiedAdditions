// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.redstone;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class RedstoneSword extends RedstoneItem
{
    public RedstoneSword() {
        super(DamageableItem.STONE_SWORD, "modified_additions:redstone_sword", "Redstone Sword", "redstone_sword");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.REDSTONE, Material.STICK));
    }
}

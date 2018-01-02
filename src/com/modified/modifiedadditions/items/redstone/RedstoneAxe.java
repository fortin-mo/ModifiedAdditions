// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.redstone;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class RedstoneAxe extends RedstoneItem
{
    public RedstoneAxe() {
        super(DamageableItem.STONE_AXE, "modified_additions:redstone_axe", "Redstone Axe", "redstone_axe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.REDSTONE, Material.STICK));
    }
}

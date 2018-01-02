// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.redstone;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class RedstoneShovel extends RedstoneItem
{
    public final String A = "TESTING";
    public final String B = "TESTING_TWO";
    
    public RedstoneShovel() {
        super(DamageableItem.STONE_SHOVEL, "modified_additions:redstone_shovel", "Redstone Shovel", "redstone_shovel");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.REDSTONE, Material.STICK));
    }
}

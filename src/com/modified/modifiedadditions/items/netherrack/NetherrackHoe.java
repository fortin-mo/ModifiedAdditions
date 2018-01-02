// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.netherrack;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class NetherrackHoe extends NetherrackItem
{
    public NetherrackHoe() {
        super(DamageableItem.STONE_HOE, "modified_additions:netherrack_hoe", "Netherrack Hoe", "netherrack_hoe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.NETHERRACK, Material.STICK));
    }
}

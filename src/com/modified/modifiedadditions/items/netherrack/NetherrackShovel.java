// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.netherrack;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class NetherrackShovel extends NetherrackItem
{
    public NetherrackShovel() {
        super(DamageableItem.STONE_SHOVEL, "modified_additions:netherrack_shovel", "Netherrack Shovel", "netherrack_shovel");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.NETHERRACK, Material.STICK));
    }
}

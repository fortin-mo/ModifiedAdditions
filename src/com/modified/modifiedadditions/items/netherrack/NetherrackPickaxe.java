// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.netherrack;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class NetherrackPickaxe extends NetherrackItem
{
    public NetherrackPickaxe() {
        super(DamageableItem.STONE_PICKAXE, "modified_additions:netherrack_pickaxe", "Netherrack Pickaxe", "netherrack_pickaxe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.NETHERRACK, Material.STICK));
    }
}

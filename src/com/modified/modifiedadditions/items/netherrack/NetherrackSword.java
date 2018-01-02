// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.netherrack;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class NetherrackSword extends NetherrackItem
{
    public NetherrackSword() {
        super(DamageableItem.STONE_SWORD, "modified_additions:netherrack_sword", "Netherrack Sword", "netherrack_sword");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.NETHERRACK, Material.STICK));
    }
}

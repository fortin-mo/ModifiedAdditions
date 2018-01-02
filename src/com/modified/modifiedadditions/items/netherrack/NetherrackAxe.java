// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.netherrack;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class NetherrackAxe extends NetherrackItem
{
    public NetherrackAxe() {
        super(DamageableItem.STONE_AXE, "modified_additions:netherrack_axe", "Netherrack Axe", "netherrack_axe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.NETHERRACK, Material.STICK));
    }
}

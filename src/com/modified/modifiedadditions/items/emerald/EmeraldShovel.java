// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.emerald;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class EmeraldShovel extends EmeraldItem
{
    public EmeraldShovel() {
        super(DamageableItem.DIAMOND_SHOVEL, "modified_additions:emerald_shovel", "Emerald Shovel", "emerald_shovel");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.EMERALD, Material.STICK));
    }
}

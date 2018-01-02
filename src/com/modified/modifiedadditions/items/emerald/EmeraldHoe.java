// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.emerald;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class EmeraldHoe extends EmeraldItem
{
    public EmeraldHoe() {
        super(DamageableItem.DIAMOND_HOE, "modified_additions:emerald_hoe", "Emerald Hoe", "emerald_hoe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.EMERALD, Material.STICK));
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.coal;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class CoalHoe extends CoalItem
{
    public CoalHoe() {
        super(DamageableItem.WOODEN_HOE, "modified_additions:coal_hoe", "Coal Hoe", "coal_hoe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.COAL, Material.STICK));
    }
    
    @Override
    public int getCoalAmount() {
        return 2;
    }
    
    @Override
    public int getStickAmount() {
        return 2;
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.coal;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class CoalShovel extends CoalItem
{
    public CoalShovel() {
        super(DamageableItem.WOODEN_SHOVEL, "modified_additions:coal_shovel", "Coal Shovel", "coal_shovel");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.COAL, Material.STICK));
    }
    
    @Override
    public int getCoalAmount() {
        return 1;
    }
    
    @Override
    public int getStickAmount() {
        return 2;
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.coal;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class CoalAxe extends CoalItem
{
    public CoalAxe() {
        super(DamageableItem.WOODEN_AXE, "modified_additions:coal_axe", "Coal Axe", "coal_axe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.COAL, Material.STICK));
    }
    
    @Override
    public int getCoalAmount() {
        return 3;
    }
    
    @Override
    public int getStickAmount() {
        return 2;
    }
}

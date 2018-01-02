// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.coal;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class CoalPickaxe extends CoalItem
{
    public CoalPickaxe() {
        super(DamageableItem.WOODEN_PICKAXE, "modified_additions:coal_pickaxe", "Coal Pickaxe", "coal_pickaxe");
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

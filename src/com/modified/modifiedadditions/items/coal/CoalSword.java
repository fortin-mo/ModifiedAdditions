// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.coal;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class CoalSword extends CoalItem
{
    public CoalSword() {
        super(DamageableItem.WOODEN_SWORD, "modified_additions:coal_sword", "Coal Sword", "coal_sword");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.COAL, Material.STICK));
    }
    
    @Override
    public int getCoalAmount() {
        return 2;
    }
    
    @Override
    public int getStickAmount() {
        return 1;
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.sickles;

import com.chrismin13.additionsapi.items.CustomTool;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import com.modified.modifiedadditions.abilities.SickleAbilities;
import com.modified.modifiedadditions.items.coal.CoalItem;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class CoalSickle extends CoalItem implements SickleAbilities
{
    public CoalSickle() {
        super(DamageableItem.WOODEN_HOE, "modified_additions:coal_sickle", "Coal Sickle", "coal_sickle");
        this.modifyCustomItem((CustomTool)this, new RecipeIngredient(Material.COAL));
    }
    
    @Override
    public int getBreakRadius() {
        return 1;
    }
    
    @Override
    public int getCoalAmount() {
        return 3;
    }
    
    @Override
    public int getStickAmount() {
        return 1;
    }
}

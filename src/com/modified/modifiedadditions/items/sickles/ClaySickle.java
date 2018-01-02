// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.sickles;

import com.chrismin13.additionsapi.items.CustomTool;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import com.modified.modifiedadditions.abilities.SickleAbilities;
import com.modified.modifiedadditions.items.clay.ClayItem;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class ClaySickle extends ClayItem implements SickleAbilities
{
    public ClaySickle() {
        super(DamageableItem.WOODEN_HOE, "modified_additions:clay_sickle", "Clay Sickle", "clay_sickle");
        this.modifyCustomItem((CustomTool)this, new RecipeIngredient(Material.CLAY_BALL));
    }
    
    @Override
    public int getBreakRadius() {
        return 1;
    }
}

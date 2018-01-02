// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.sickles;

import com.chrismin13.additionsapi.items.CustomTool;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import com.modified.modifiedadditions.abilities.SickleAbilities;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;
import com.modified.modifiedadditions.items.emerald.EmeraldItem;

public class EmeraldSickle extends EmeraldItem implements SickleAbilities
{
    public EmeraldSickle() {
        super(DamageableItem.DIAMOND_HOE, "modified_additions:emerald_sickle", "Emerald Sickle", "emerald_sickle");
        this.modifyCustomItem((CustomTool)this, new RecipeIngredient(Material.EMERALD));
    }
    
    @Override
    public int getBreakRadius() {
        return 5;
    }
}

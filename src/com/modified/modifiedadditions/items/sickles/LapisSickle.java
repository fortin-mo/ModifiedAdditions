// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.sickles;

import com.chrismin13.additionsapi.items.CustomTool;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import com.modified.modifiedadditions.abilities.SickleAbilities;
import com.modified.modifiedadditions.items.lapis.LapisItem;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class LapisSickle extends LapisItem implements SickleAbilities
{
    public LapisSickle() {
        super(DamageableItem.IRON_HOE, "modified_additions:lapis_sickle", "Lapis Sickle", "lapis_sickle");
        this.modifyCustomItem((CustomTool)this, new RecipeIngredient(Material.INK_SACK, (byte)4));
    }
    
    @Override
    public int getBreakRadius() {
        return 3;
    }
}

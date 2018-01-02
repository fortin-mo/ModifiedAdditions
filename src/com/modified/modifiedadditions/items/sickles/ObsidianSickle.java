// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.sickles;

import com.chrismin13.additionsapi.items.CustomTool;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import com.modified.modifiedadditions.abilities.SickleAbilities;
import com.modified.modifiedadditions.items.obsidian.ObsidianItem;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class ObsidianSickle extends ObsidianItem implements SickleAbilities
{
    public ObsidianSickle() {
        super(DamageableItem.IRON_HOE, "modified_additions:obsidian_sickle", "Obsidian Sickle", "obsidian_sickle");
        this.modifyCustomItem((CustomTool)this, new RecipeIngredient(Material.OBSIDIAN));
    }
    
    @Override
    public int getBreakRadius() {
        return 3;
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.chisels;

import com.chrismin13.additionsapi.recipes.CustomRecipe;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;
import com.modified.modifiedadditions.abilities.ChiselAbilities;
import com.modified.modifiedadditions.items.obsidian.ObsidianItem;

public class ObsidianChisel extends ObsidianItem implements ChiselAbilities
{
    public ObsidianChisel() {
        super(DamageableItem.IRON_PICKAXE, "modified_additions:obsidian_chisel", "Obsidian Chisel", "obsidian_chisel");
        this.addCustomRecipe((CustomRecipe)this.getRecipe(new RecipeIngredient(Material.OBSIDIAN), new RecipeIngredient(Material.STICK)));
    }
}

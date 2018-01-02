// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.chisels;

import com.chrismin13.additionsapi.recipes.CustomRecipe;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import com.modified.modifiedadditions.items.slime.SlimeItem;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;
import com.modified.modifiedadditions.abilities.ChiselAbilities;

public class SlimeChisel extends SlimeItem implements ChiselAbilities
{
    public SlimeChisel() {
        super(DamageableItem.WOODEN_PICKAXE, "modified_additions:slime_chisel", "Slime Chisel", "slime_chisel");
        this.addCustomRecipe((CustomRecipe)this.getRecipe(new RecipeIngredient(Material.SLIME_BALL), new RecipeIngredient(Material.STICK)));
    }
}

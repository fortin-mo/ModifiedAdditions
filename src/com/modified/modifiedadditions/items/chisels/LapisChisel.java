// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.chisels;

import com.chrismin13.additionsapi.items.CustomTool;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import com.modified.modifiedadditions.abilities.ChiselAbilities;
import com.modified.modifiedadditions.items.lapis.LapisItem;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class LapisChisel extends LapisItem implements ChiselAbilities
{
    public LapisChisel() {
        super(DamageableItem.IRON_PICKAXE, "modified_additions:lapis_chisel", "Lapis Chisel", "lapis_chisel");
        this.modifyCustomItem((CustomTool)this, new RecipeIngredient(Material.INK_SACK, (byte)4));
    }
}

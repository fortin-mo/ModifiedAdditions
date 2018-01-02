// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.doubleaxes;

import com.chrismin13.additionsapi.items.CustomTool;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import com.modified.modifiedadditions.abilities.DoubleAxeAbilities;
import com.modified.modifiedadditions.items.lapis.LapisItem;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class LapisDoubleAxe extends LapisItem implements DoubleAxeAbilities
{
    public LapisDoubleAxe() {
        super(DamageableItem.IRON_AXE, "modified_additions:lapis_double_axe", "Lapis Double Axe", "lapis_double_axe");
        this.modifyCustomItem((CustomTool)this, new RecipeIngredient(Material.INK_SACK, (byte)4));
    }
}

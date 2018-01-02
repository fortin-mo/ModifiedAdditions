// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.lapis;

import com.chrismin13.additionsapi.utils.MaterialUtils;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import com.modified.modifiedadditions.items.AverageLeatherArmor;
import org.bukkit.Material;
import org.bukkit.Color;
import com.chrismin13.additionsapi.enums.ArmorType;

public class LapisArmor extends AverageLeatherArmor
{
    public LapisArmor(final ArmorType armorType) {
        super(armorType, armorType.getLeatherMaterial().getMaxDurability(), "modified_additions:lapis_" + armorType.toString().toLowerCase(), "Lapis " + armorType.toIngameString(), Color.fromRGB(34, 75, 175), new RecipeIngredient(Material.INK_SACK, (byte)4), MaterialUtils.getBaseArmor(armorType.getIronMaterial()), MaterialUtils.getBaseArmorToughness(armorType.getIronMaterial()));
    }
}

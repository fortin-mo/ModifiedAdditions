// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.clay;

import com.chrismin13.additionsapi.utils.MaterialUtils;
import org.bukkit.Material;
import org.bukkit.Color;
import com.chrismin13.additionsapi.enums.ArmorType;
import com.modified.modifiedadditions.items.AverageLeatherArmor;

public class ClayArmor extends AverageLeatherArmor
{
    public ClayArmor(final ArmorType armorType) {
        super(armorType, armorType.getGoldMaterial().getMaxDurability(), "modified_additions:clay_" + armorType.toString().toLowerCase(), "Clay " + armorType.toIngameString(), Color.fromRGB(165, 169, 185), Material.CLAY_BALL, MaterialUtils.getBaseArmor(armorType.getLeatherMaterial()), MaterialUtils.getBaseArmorToughness(armorType.getLeatherMaterial()));
    }
}

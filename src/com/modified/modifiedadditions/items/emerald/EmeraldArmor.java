// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.emerald;

import com.chrismin13.additionsapi.utils.MaterialUtils;
import org.bukkit.Material;
import org.bukkit.Color;
import com.chrismin13.additionsapi.enums.ArmorType;
import com.modified.modifiedadditions.items.AverageLeatherArmor;

public class EmeraldArmor extends AverageLeatherArmor
{
    public EmeraldArmor(final ArmorType armorType) {
        super(armorType, armorType.getDiamondMaterial().getMaxDurability() * 2 + 1, "modified_additions:emerald_" + armorType.toString().toLowerCase(), "Emerald " + armorType.toIngameString(), Color.fromRGB(0, 255, 76), Material.EMERALD, MaterialUtils.getBaseArmor(armorType.getDiamondMaterial()), MaterialUtils.getBaseArmorToughness(armorType.getDiamondMaterial()));
    }
}

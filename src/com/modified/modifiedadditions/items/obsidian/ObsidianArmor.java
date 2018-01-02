// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.obsidian;

import com.comphenix.attribute.Attributes;
import com.chrismin13.additionsapi.utils.MaterialUtils;
import org.bukkit.Material;
import org.bukkit.Color;
import com.chrismin13.additionsapi.enums.ArmorType;
import com.modified.modifiedadditions.items.AverageLeatherArmor;

public class ObsidianArmor extends AverageLeatherArmor
{
    public ObsidianArmor(final ArmorType armorType) {
        super(armorType, armorType.getDiamondMaterial().getMaxDurability() * 4 + 3, "modified_additions:obsidian_" + armorType.toString().toLowerCase(), "Obsidian " + armorType.toIngameString(), Color.fromRGB(24, 17, 37), Material.OBSIDIAN, MaterialUtils.getBaseArmor(armorType.getIronMaterial()), MaterialUtils.getBaseArmorToughness(armorType.getIronMaterial()));
        this.addAttribute(Attributes.AttributeType.GENERIC_KNOCKBACK_RESISTANCE, 0.1, Attributes.Operation.ADD_NUMBER);
    }
}

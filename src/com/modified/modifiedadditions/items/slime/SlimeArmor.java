// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.slime;

import com.comphenix.attribute.Attributes;
import com.chrismin13.additionsapi.utils.MaterialUtils;
import com.modified.modifiedadditions.items.AverageLeatherArmor;
import org.bukkit.Material;
import org.bukkit.Color;
import com.chrismin13.additionsapi.enums.ArmorType;

public class SlimeArmor extends AverageLeatherArmor
{
    public SlimeArmor(final ArmorType armorType) {
        super(armorType, armorType.getGoldMaterial().getMaxDurability(), "modified_additions:slime_" + armorType.toString().toLowerCase(), "Slime " + armorType.toIngameString(), Color.fromRGB(125, 200, 115), Material.SLIME_BALL, MaterialUtils.getBaseArmor(armorType.getLeatherMaterial()), MaterialUtils.getBaseArmorToughness(armorType.getLeatherMaterial()));
        this.addAttribute(Attributes.AttributeType.GENERIC_KNOCKBACK_RESISTANCE, -0.1, Attributes.Operation.ADD_NUMBER);
    }
}

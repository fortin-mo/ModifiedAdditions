// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.coal;

import com.chrismin13.additionsapi.utils.MaterialUtils;
import org.bukkit.Material;
import org.bukkit.Color;
import com.chrismin13.additionsapi.enums.ArmorType;
import com.modified.modifiedadditions.items.AverageLeatherArmor;

public class CoalArmor extends AverageLeatherArmor
{
    public CoalArmor(final ArmorType armorType) {
        super(armorType, 0, "modified_additions:coal_" + armorType.toString().toLowerCase(), "Coal " + armorType.toIngameString(), Color.fromRGB(46, 46, 46), Material.COAL, MaterialUtils.getBaseArmor(armorType.getLeatherMaterial()), MaterialUtils.getBaseArmorToughness(armorType.getLeatherMaterial()));
        this.setUnbreakable(false);
    }
}

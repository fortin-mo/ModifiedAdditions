// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.prismarine;

import com.chrismin13.additionsapi.utils.MaterialUtils;
import com.modified.modifiedadditions.items.AverageLeatherArmor;
import org.bukkit.Material;
import org.bukkit.Color;
import com.chrismin13.additionsapi.enums.ArmorType;

public class PrismarineArmor extends AverageLeatherArmor
{
    public PrismarineArmor(final ArmorType armorType) {
        super(armorType, armorType.getIronMaterial().getMaxDurability(), "modified_additions:prismarine_" + armorType.toString().toLowerCase(), "Prismarine " + armorType.toIngameString(), Color.fromRGB(116, 183, 179), Material.PRISMARINE_SHARD, MaterialUtils.getBaseArmor(armorType.getDiamondMaterial()), MaterialUtils.getBaseArmorToughness(armorType.getDiamondMaterial()));
    }
}

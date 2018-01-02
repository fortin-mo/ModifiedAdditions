// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.netherrack;

import com.chrismin13.additionsapi.utils.MaterialUtils;
import com.modified.modifiedadditions.items.AverageLeatherArmor;
import org.bukkit.Material;
import org.bukkit.Color;
import com.chrismin13.additionsapi.enums.ArmorType;

public class NetherrackArmor extends AverageLeatherArmor
{
    public NetherrackArmor(final ArmorType armorType) {
        super(armorType, armorType.getLeatherMaterial().getMaxDurability() / 2, "modified_additions:netherrack_" + armorType.toString().toLowerCase(), "Netherrack " + armorType.toIngameString(), Color.fromRGB(166, 89, 89), Material.NETHERRACK, MaterialUtils.getBaseArmor(armorType.getChainmailMaterial()), MaterialUtils.getBaseArmorToughness(armorType.getChainmailMaterial()));
    }
}

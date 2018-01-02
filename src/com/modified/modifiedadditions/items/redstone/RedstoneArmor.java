// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.redstone;

import com.chrismin13.additionsapi.utils.MaterialUtils;
import org.bukkit.Material;
import org.bukkit.Color;
import com.chrismin13.additionsapi.enums.ArmorType;
import com.modified.modifiedadditions.items.AverageLeatherArmor;

public class RedstoneArmor extends AverageLeatherArmor
{
    public RedstoneArmor(final ArmorType armorType) {
        super(armorType, 0, "modified_additions:redstone_" + armorType.toString().toLowerCase(), "Redstone " + armorType.toIngameString(), Color.fromRGB(205, 0, 0), Material.REDSTONE, MaterialUtils.getBaseArmor(armorType.getChainmailMaterial()), MaterialUtils.getBaseArmorToughness(armorType.getChainmailMaterial()));
        this.setUnbreakable(false);
    }
}

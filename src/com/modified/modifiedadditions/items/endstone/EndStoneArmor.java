// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.endstone;

import com.chrismin13.additionsapi.items.CustomArmor;
import com.chrismin13.additionsapi.utils.MaterialUtils;
import org.bukkit.Material;
import org.bukkit.Color;
import com.chrismin13.additionsapi.enums.ArmorType;
import com.modified.modifiedadditions.abilities.StoneArmorAbilities;
import com.modified.modifiedadditions.items.AverageLeatherArmor;

public class EndStoneArmor extends AverageLeatherArmor implements StoneArmorAbilities
{
    public EndStoneArmor(final ArmorType armorType) {
        super(armorType, armorType.getIronMaterial().getMaxDurability(), "modified_additions:end_stone_" + armorType.toString().toLowerCase(), "End Stone " + armorType.toIngameString(), Color.fromRGB(237, 237, 154), Material.ENDER_STONE, MaterialUtils.getBaseArmor(armorType.getChainmailMaterial()), MaterialUtils.getBaseArmorToughness(armorType.getChainmailMaterial()));
        this.modifyCustomItem((CustomArmor)this);
    }
}

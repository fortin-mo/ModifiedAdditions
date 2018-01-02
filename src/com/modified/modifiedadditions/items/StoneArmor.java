// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items;

import com.chrismin13.additionsapi.items.CustomArmor;
import com.chrismin13.additionsapi.utils.MaterialUtils;
import org.bukkit.Material;
import org.bukkit.Color;
import com.chrismin13.additionsapi.enums.ArmorType;
import com.modified.modifiedadditions.abilities.StoneArmorAbilities;

public class StoneArmor extends AverageLeatherArmor implements StoneArmorAbilities
{
    public StoneArmor(final ArmorType armorType) {
        super(armorType, 0, "modified_additions:stone_" + armorType.toString().toLowerCase(), "Stone " + armorType.toIngameString(), Color.fromRGB(103, 103, 103), Material.COBBLESTONE, MaterialUtils.getBaseArmor(armorType.getChainmailMaterial()), MaterialUtils.getBaseArmorToughness(armorType.getChainmailMaterial()));
        this.modifyCustomItem((CustomArmor)this);
        this.setUnbreakable(false);
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.abilities;

import com.comphenix.attribute.Attributes;
import com.chrismin13.additionsapi.items.CustomArmor;

public interface StoneArmorAbilities
{
    default void modifyCustomItem(final CustomArmor cArmor) {
        cArmor.addAttribute(Attributes.AttributeType.GENERIC_MOVEMENT_SPEED, -0.07999999821186066, Attributes.Operation.ADD_PERCENTAGE);
    }
}

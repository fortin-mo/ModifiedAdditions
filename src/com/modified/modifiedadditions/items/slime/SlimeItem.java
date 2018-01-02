// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.slime;

import org.bukkit.inventory.EquipmentSlot;
import com.comphenix.attribute.Attributes;
import com.chrismin13.additionsapi.utils.MaterialUtils;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;
import com.modified.modifiedadditions.items.AverageTexturedTool;

public class SlimeItem extends AverageTexturedTool
{
    public SlimeItem(final DamageableItem damageableItem, final String s, final String s2, final String s3) {
        super(damageableItem, Material.WOOD_SWORD.getMaxDurability(), s, s2, s3);
        this.addAttackSpeed((double)MaterialUtils.getBaseSpeed(this.getMaterial()));
        this.addAttackDamage((double)MaterialUtils.getBaseDamage(this.getMaterial()));
        this.addAttribute(Attributes.AttributeType.GENERIC_KNOCKBACK_RESISTANCE, -0.1, EquipmentSlot.HAND, Attributes.Operation.ADD_NUMBER);
    }
}

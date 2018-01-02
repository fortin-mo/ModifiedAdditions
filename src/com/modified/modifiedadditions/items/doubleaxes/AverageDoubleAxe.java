// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.doubleaxes;

import com.chrismin13.additionsapi.items.CustomTool;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;
import com.modified.modifiedadditions.abilities.DoubleAxeAbilities;
import com.modified.modifiedadditions.items.AverageTexturedTool;

public class AverageDoubleAxe extends AverageTexturedTool implements DoubleAxeAbilities
{
    public AverageDoubleAxe(DamageableItem damageableItem, int durability, String idName, String displayName, String defaultTexture, Material craftingMaterial) {
        super(damageableItem, durability, idName, displayName, defaultTexture);
        this.modifyCustomItem(this, craftingMaterial);
    }
}

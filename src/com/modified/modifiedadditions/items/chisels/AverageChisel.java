// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.chisels;

import com.chrismin13.additionsapi.items.CustomTool;
import com.modified.modifiedadditions.abilities.ChiselAbilities;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;
import com.modified.modifiedadditions.items.AverageTexturedTool;

public class AverageChisel extends AverageTexturedTool implements ChiselAbilities
{
    public AverageChisel(final DamageableItem damageableItem, final int n, final String s, final String s2, final String s3, final Material craftingMaterial) {
        super(damageableItem, n, s, s2, s3);
        this.modifyCustomItem((CustomTool)this, craftingMaterial);
    }
}

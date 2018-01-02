// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.coal;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;
import com.modified.modifiedadditions.items.AverageTexturedTool;

public abstract class CoalItem extends AverageTexturedTool
{
    public CoalItem(final DamageableItem damageableItem, final String s, final String s2, final String s3) {
        super(damageableItem, Material.STONE_SWORD.getMaxDurability(), s, s2, s3);
        this.setBurnTime(this.getStickAmount() * 100 + this.getCoalAmount() * 800);
    }
    
    public abstract int getCoalAmount();
    
    public abstract int getStickAmount();
}

// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.sickles;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class GoldSickle extends AverageSickle
{
    public GoldSickle() {
        super(DamageableItem.GOLDEN_HOE, Material.GOLD_HOE.getMaxDurability(), "modified_additions:golden_sickle", "Golden Sickle", "gold_sickle", Material.GOLD_INGOT);
    }
    
    @Override
    public int getBreakRadius() {
        return 4;
    }
}

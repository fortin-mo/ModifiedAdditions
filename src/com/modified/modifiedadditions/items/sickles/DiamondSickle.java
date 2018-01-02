// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.sickles;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class DiamondSickle extends AverageSickle
{
    public DiamondSickle() {
        super(DamageableItem.DIAMOND_HOE, Material.DIAMOND_HOE.getMaxDurability(), "modified_additions:diamond_sickle", "Diamond Sickle", "diamond_sickle", Material.DIAMOND);
    }
    
    @Override
    public int getBreakRadius() {
        return 5;
    }
}

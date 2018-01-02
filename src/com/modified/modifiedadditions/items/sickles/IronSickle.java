// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.sickles;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class IronSickle extends AverageSickle
{
    public IronSickle() {
        super(DamageableItem.IRON_HOE, Material.IRON_HOE.getMaxDurability(), "modified_additions:iron_sickle", "Iron Sickle", "iron_sickle", Material.IRON_INGOT);
    }
    
    @Override
    public int getBreakRadius() {
        return 3;
    }
}

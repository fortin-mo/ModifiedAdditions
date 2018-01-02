// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.sickles;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class StoneSickle extends AverageSickle
{
    public StoneSickle() {
        super(DamageableItem.STONE_HOE, Material.STONE_HOE.getMaxDurability(), "modified_additions:stone_sickle", "Stone Sickle", "stone_sickle", Material.COBBLESTONE);
    }
    
    @Override
    public int getBreakRadius() {
        return 2;
    }
}

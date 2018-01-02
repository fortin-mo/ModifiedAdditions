// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.durability;

import org.bukkit.Material;
import com.chrismin13.additionsapi.durability.ItemDurability;

public class SickleDurability extends ItemDurability
{
    public SickleDurability() {
        this.addSpecialBlock(Material.getMaterial(59), 1);
        this.addSpecialBlock(Material.getMaterial(141), 1);
        this.addSpecialBlock(Material.getMaterial(142), 1);
        this.addSpecialBlock(Material.getMaterial(207), 1);
        this.setBlockBreak(1);
        this.setEntityHit(2);
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.redstone;

import com.modified.modifiedadditions.items.AverageTexturedTool;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class RedstoneItem extends AverageTexturedTool
{
    public RedstoneItem(final DamageableItem damageableItem, final String s, final String s2, final String s3) {
        super(damageableItem, Material.STONE_SWORD.getMaxDurability(), s, s2, s3);
    }
}

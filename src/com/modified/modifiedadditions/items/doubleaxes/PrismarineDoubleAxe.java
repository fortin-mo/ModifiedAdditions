// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.doubleaxes;

import com.chrismin13.additionsapi.items.CustomTool;
import com.modified.modifiedadditions.abilities.DoubleAxeAbilities;
import com.modified.modifiedadditions.items.prismarine.PrismarineItem;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class PrismarineDoubleAxe extends PrismarineItem implements DoubleAxeAbilities
{
    public PrismarineDoubleAxe() {
        super(DamageableItem.DIAMOND_AXE, "modified_additions:prismarine_double_axe", "Prismarine Double Axe", "prismarine_double_axe");
        this.modifyCustomItem((CustomTool)this, Material.PRISMARINE_SHARD);
    }
}

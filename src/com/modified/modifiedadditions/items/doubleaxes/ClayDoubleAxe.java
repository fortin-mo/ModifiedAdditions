// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.doubleaxes;

import com.chrismin13.additionsapi.items.CustomTool;
import com.modified.modifiedadditions.abilities.DoubleAxeAbilities;
import com.modified.modifiedadditions.items.clay.ClayItem;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class ClayDoubleAxe extends ClayItem implements DoubleAxeAbilities
{
    public ClayDoubleAxe() {
        super(DamageableItem.WOODEN_AXE, "modified_additions:clay_double_axe", "Clay Double Axe", "clay_double_axe");
        this.modifyCustomItem((CustomTool)this, Material.CLAY_BALL);
    }
}

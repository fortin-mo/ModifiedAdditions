// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.doubleaxes;

import com.chrismin13.additionsapi.items.CustomTool;
import com.modified.modifiedadditions.abilities.DoubleAxeAbilities;
import com.modified.modifiedadditions.items.netherrack.NetherrackItem;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class NetherrackDoubleAxe extends NetherrackItem implements DoubleAxeAbilities
{
    public NetherrackDoubleAxe() {
        super(DamageableItem.STONE_AXE, "modified_additions:netherrack_double_axe", "Netherrack Double Axe", "netherrack_double_axe");
        this.modifyCustomItem((CustomTool)this, Material.NETHERRACK);
    }
}

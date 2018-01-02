// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.doubleaxes;

import com.chrismin13.additionsapi.items.CustomTool;
import com.modified.modifiedadditions.abilities.DoubleAxeAbilities;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;
import com.modified.modifiedadditions.items.redstone.RedstoneItem;

public class RedstoneDoubleAxe extends RedstoneItem implements DoubleAxeAbilities
{
    public RedstoneDoubleAxe() {
        super(DamageableItem.STONE_AXE, "modified_additions:redstone_double_axe", "Redstone Double Axe", "redstone_double_axe");
        this.modifyCustomItem((CustomTool)this, Material.REDSTONE);
    }
}

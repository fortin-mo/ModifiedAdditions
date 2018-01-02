// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.doubleaxes;

import com.chrismin13.additionsapi.items.CustomTool;
import com.modified.modifiedadditions.abilities.DoubleAxeAbilities;
import com.modified.modifiedadditions.items.endstone.EndStoneItem;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class EndStoneDoubleAxe extends EndStoneItem implements DoubleAxeAbilities
{
    public EndStoneDoubleAxe() {
        super(DamageableItem.STONE_AXE, "modified_additions:end_stone_double_axe", "End Stone Double Axe", "end_stone_double_axe");
        this.modifyCustomItem((CustomTool)this, Material.ENDER_STONE);
    }
}

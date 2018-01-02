// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.chisels;

import com.chrismin13.additionsapi.items.CustomTool;
import com.modified.modifiedadditions.items.endstone.EndStoneItem;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;
import com.modified.modifiedadditions.abilities.ChiselAbilities;

public class EndStoneChisel extends EndStoneItem implements ChiselAbilities
{
    public EndStoneChisel() {
        super(DamageableItem.STONE_PICKAXE, "modified_additions:end_stone_chisel", "End Stone Chisel", "end_stone_chisel");
        this.modifyCustomItem((CustomTool)this, Material.ENDER_STONE);
    }
}

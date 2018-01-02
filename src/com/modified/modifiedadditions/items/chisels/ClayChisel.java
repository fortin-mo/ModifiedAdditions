// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.chisels;

import com.chrismin13.additionsapi.items.CustomTool;
import com.modified.modifiedadditions.items.clay.ClayItem;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;
import com.modified.modifiedadditions.abilities.ChiselAbilities;

public class ClayChisel extends ClayItem implements ChiselAbilities
{
    public ClayChisel() {
        super(DamageableItem.WOODEN_PICKAXE, "modified_additions:clay_chisel", "Clay Chisel", "clay_chisel");
        this.modifyCustomItem((CustomTool)this, Material.CLAY_BALL);
    }
}

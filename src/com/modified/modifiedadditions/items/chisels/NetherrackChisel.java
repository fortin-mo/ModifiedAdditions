// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.chisels;

import com.chrismin13.additionsapi.items.CustomTool;
import com.modified.modifiedadditions.items.netherrack.NetherrackItem;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;
import com.modified.modifiedadditions.abilities.ChiselAbilities;

public class NetherrackChisel extends NetherrackItem implements ChiselAbilities
{
    public NetherrackChisel() {
        super(DamageableItem.STONE_PICKAXE, "modified_additions:netherrack_chisel", "Netherrack Chisel", "netherrack_chisel");
        this.modifyCustomItem((CustomTool)this, Material.NETHERRACK);
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.chisels;

import com.chrismin13.additionsapi.items.CustomTool;
import com.modified.modifiedadditions.abilities.ChiselAbilities;
import com.modified.modifiedadditions.items.redstone.RedstoneItem;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class RedstoneChisel extends RedstoneItem implements ChiselAbilities
{
    public RedstoneChisel() {
        super(DamageableItem.STONE_PICKAXE, "modified_additions:redstone_chisel", "Redstone Chisel", "redstone_chisel");
        this.modifyCustomItem((CustomTool)this, Material.REDSTONE);
    }
}

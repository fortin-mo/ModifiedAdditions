// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.chisels;

import com.chrismin13.additionsapi.items.CustomTool;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;
import com.modified.modifiedadditions.abilities.ChiselAbilities;
import com.modified.modifiedadditions.items.prismarine.PrismarineItem;

public class PrismarineChisel extends PrismarineItem implements ChiselAbilities
{
    public PrismarineChisel() {
        super(DamageableItem.DIAMOND_PICKAXE, "modified_additions:prismarine_chisel", "Prismarine Chisel", "prismarine_chisel");
        this.modifyCustomItem((CustomTool)this, Material.PRISMARINE_SHARD);
    }
}

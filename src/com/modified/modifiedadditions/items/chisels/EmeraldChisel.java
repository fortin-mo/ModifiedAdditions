// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.chisels;

import com.chrismin13.additionsapi.items.CustomTool;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;
import com.modified.modifiedadditions.abilities.ChiselAbilities;
import com.modified.modifiedadditions.items.emerald.EmeraldItem;

public class EmeraldChisel extends EmeraldItem implements ChiselAbilities
{
    public EmeraldChisel() {
        super(DamageableItem.DIAMOND_PICKAXE, "modified_additions:emerald_chisel", "Emerald Chisel", "emerald_chisel");
        this.modifyCustomItem((CustomTool)this, Material.EMERALD);
    }
}

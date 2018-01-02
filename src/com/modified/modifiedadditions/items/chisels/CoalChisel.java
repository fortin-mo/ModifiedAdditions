// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.chisels;

import com.chrismin13.additionsapi.items.CustomTool;
import com.modified.modifiedadditions.abilities.ChiselAbilities;
import com.modified.modifiedadditions.items.coal.CoalItem;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class CoalChisel extends CoalItem implements ChiselAbilities
{
    public CoalChisel() {
        super(DamageableItem.WOODEN_PICKAXE, "modified_additions:coal_chisel", "Coal Chisel", "coal_chisel");
        this.modifyCustomItem((CustomTool)this, Material.COAL);
    }
    
    @Override
    public int getCoalAmount() {
        return 5;
    }
    
    @Override
    public int getStickAmount() {
        return 2;
    }
}

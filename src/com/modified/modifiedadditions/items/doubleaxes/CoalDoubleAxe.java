// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.doubleaxes;

import com.chrismin13.additionsapi.items.CustomTool;
import com.modified.modifiedadditions.abilities.DoubleAxeAbilities;
import com.modified.modifiedadditions.items.coal.CoalItem;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class CoalDoubleAxe extends CoalItem implements DoubleAxeAbilities
{
    public CoalDoubleAxe() {
        super(DamageableItem.WOODEN_AXE, "modified_additions:coal_double_axe", "Coal Double Axe", "coal_double_axe");
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

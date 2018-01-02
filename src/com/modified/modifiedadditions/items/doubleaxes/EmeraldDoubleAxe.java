// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.doubleaxes;

import com.chrismin13.additionsapi.items.CustomTool;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;
import com.modified.modifiedadditions.abilities.DoubleAxeAbilities;
import com.modified.modifiedadditions.items.emerald.EmeraldItem;

public class EmeraldDoubleAxe extends EmeraldItem implements DoubleAxeAbilities
{
    public EmeraldDoubleAxe() {
        super(DamageableItem.DIAMOND_AXE, "modified_additions:emerald_double_axe", "Emerald Double Axe", "emerald_double_axe");
        this.modifyCustomItem((CustomTool)this, Material.EMERALD);
    }
}

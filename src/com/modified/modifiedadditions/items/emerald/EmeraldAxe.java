// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.emerald;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class EmeraldAxe extends EmeraldItem
{
    public EmeraldAxe() {
        super(DamageableItem.DIAMOND_AXE, "modified_additions:emerald_axe", "Emerald Axe", "emerald_axe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.EMERALD, Material.STICK));
    }
}

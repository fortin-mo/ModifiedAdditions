// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.emerald;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class EmeraldPickaxe extends EmeraldItem
{
    public EmeraldPickaxe() {
        super(DamageableItem.DIAMOND_PICKAXE, "modified_additions:emerald_pickaxe", "Emerald Pickaxe", "emerald_pickaxe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.EMERALD, Material.STICK));
    }
}

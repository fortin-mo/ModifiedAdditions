// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.emerald;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class EmeraldSword extends EmeraldItem
{
    public EmeraldSword() {
        super(DamageableItem.DIAMOND_SWORD, "modified_additions:emerald_sword", "Emerald Sword", "emerald_sword");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.EMERALD, Material.STICK));
    }
}

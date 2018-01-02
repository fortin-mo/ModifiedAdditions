// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.obsidian;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class ObsidianSword extends ObsidianItem
{
    public ObsidianSword() {
        super(DamageableItem.IRON_SWORD, "modified_additions:obsidian_sword", "Obsidian Sword", "obsidian_sword");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.OBSIDIAN, Material.STICK));
    }
}

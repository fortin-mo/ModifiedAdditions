// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.obsidian;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class ObsidianHoe extends ObsidianItem
{
    public ObsidianHoe() {
        super(DamageableItem.IRON_HOE, "modified_additions:obsidian_hoe", "Obsidian Hoe", "obsidian_hoe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.OBSIDIAN, Material.STICK));
    }
}

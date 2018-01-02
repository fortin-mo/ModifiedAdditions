// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.obsidian;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class ObsidianShovel extends ObsidianItem
{
    public ObsidianShovel() {
        super(DamageableItem.IRON_SHOVEL, "modified_additions:obsidian_shovel", "Obsidian Shovel", "obsidian_shovel");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.OBSIDIAN, Material.STICK));
    }
}

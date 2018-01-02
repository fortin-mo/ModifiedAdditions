// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.obsidian;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class ObsidianAxe extends ObsidianItem
{
    public ObsidianAxe() {
        super(DamageableItem.IRON_AXE, "modified_additions:obsidian_axe", "Obsidian Axe", "obsidian_axe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.OBSIDIAN, Material.STICK));
    }
}

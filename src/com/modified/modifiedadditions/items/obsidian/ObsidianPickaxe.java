// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.obsidian;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class ObsidianPickaxe extends ObsidianItem
{
    public ObsidianPickaxe() {
        super(DamageableItem.IRON_PICKAXE, "modified_additions:obsidian_pickaxe", "Obsidian Pickaxe", "obsidian_pickaxe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.OBSIDIAN, Material.STICK));
    }
}

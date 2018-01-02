// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.endstone;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class EndStonePickaxe extends EndStoneItem
{
    public EndStonePickaxe() {
        super(DamageableItem.STONE_PICKAXE, "modified_additions:end_stone_pickaxe", "End Stone Pickaxe", "end_stone_pickaxe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.ENDER_STONE, Material.STICK));
    }
}

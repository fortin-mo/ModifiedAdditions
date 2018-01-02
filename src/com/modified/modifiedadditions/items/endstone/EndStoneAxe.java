// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.endstone;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class EndStoneAxe extends EndStoneItem
{
    public EndStoneAxe() {
        super(DamageableItem.STONE_AXE, "modified_additions:end_stone_axe", "End Stone Axe", "end_stone_axe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.ENDER_STONE, Material.STICK));
    }
}

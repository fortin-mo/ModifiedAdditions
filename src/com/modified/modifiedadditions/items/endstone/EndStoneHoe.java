// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.endstone;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class EndStoneHoe extends EndStoneItem
{
    public EndStoneHoe() {
        super(DamageableItem.STONE_HOE, "modified_additions:end_stone_hoe", "End Stone Hoe", "end_stone_hoe");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.ENDER_STONE, Material.STICK));
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.endstone;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class EndStoneShovel extends EndStoneItem
{
    public EndStoneShovel() {
        super(DamageableItem.STONE_SHOVEL, "modified_additions:end_stone_shovel", "End Stone Shovel", "end_stone_shovel");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.ENDER_STONE, Material.STICK));
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.endstone;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class EndStoneSword extends EndStoneItem
{
    public EndStoneSword() {
        super(DamageableItem.STONE_SWORD, "modified_additions:end_stone_sword", "End Stone Sword", "end_stone_sword");
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(Material.ENDER_STONE, Material.STICK));
    }
}

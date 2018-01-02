// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.sickles;

import com.chrismin13.additionsapi.items.CustomTool;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import com.modified.modifiedadditions.abilities.SickleAbilities;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;
import com.modified.modifiedadditions.items.endstone.EndStoneItem;

public class EndStoneSickle extends EndStoneItem implements SickleAbilities
{
    public EndStoneSickle() {
        super(DamageableItem.STONE_HOE, "modified_additions:end_stone_sickle", "End Stone Sickle", "end_stone_sickle");
        this.modifyCustomItem((CustomTool)this, new RecipeIngredient(Material.ENDER_STONE));
    }
    
    @Override
    public int getBreakRadius() {
        return 2;
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.sickles;

import com.chrismin13.additionsapi.items.CustomTool;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import com.modified.modifiedadditions.abilities.SickleAbilities;
import com.modified.modifiedadditions.items.redstone.RedstoneItem;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class RedstoneSickle extends RedstoneItem implements SickleAbilities
{
    public RedstoneSickle() {
        super(DamageableItem.STONE_HOE, "modified_additions:redstone_sickle", "Redstone Sickle", "redstone_sickle");
        this.modifyCustomItem((CustomTool)this, new RecipeIngredient(Material.REDSTONE));
    }
    
    @Override
    public int getBreakRadius() {
        return 2;
    }
}

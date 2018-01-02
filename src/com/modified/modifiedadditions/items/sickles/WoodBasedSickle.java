// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.sickles;

import com.chrismin13.additionsapi.items.CustomTool;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import com.modified.modifiedadditions.abilities.SickleAbilities;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;
import com.modified.modifiedadditions.items.wood.WoodBasedItem;

public class WoodBasedSickle extends WoodBasedItem implements SickleAbilities
{
    public WoodBasedSickle(final byte b, final String s, final String s2, final String s3) {
        super(DamageableItem.WOODEN_HOE, b, s, s2, s3, "wooden_sickle");
        this.modifyCustomItem((CustomTool)this, new RecipeIngredient(Material.WOOD, b));
    }
    
    @Override
    public int getBreakRadius() {
        return 1;
    }
}

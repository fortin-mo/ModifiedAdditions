// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.sickles;

import com.chrismin13.additionsapi.items.CustomTool;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import com.modified.modifiedadditions.abilities.SickleAbilities;
import com.modified.modifiedadditions.items.prismarine.PrismarineItem;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class PrismarineSickle extends PrismarineItem implements SickleAbilities
{
    public PrismarineSickle() {
        super(DamageableItem.DIAMOND_HOE, "modified_additions:prismarine_sickle", "Prismarine Sickle", "prismarine_sickle");
        this.modifyCustomItem((CustomTool)this, new RecipeIngredient(Material.PRISMARINE_SHARD));
    }
    
    @Override
    public int getBreakRadius() {
        return 5;
    }
}

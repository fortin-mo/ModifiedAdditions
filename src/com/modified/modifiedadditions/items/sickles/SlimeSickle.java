// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.sickles;

import com.chrismin13.additionsapi.items.CustomTool;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import com.modified.modifiedadditions.abilities.SickleAbilities;
import com.modified.modifiedadditions.items.slime.SlimeItem;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class SlimeSickle extends SlimeItem implements SickleAbilities
{
    public SlimeSickle() {
        super(DamageableItem.WOODEN_HOE, "modified_additions:slime_sickle", "Slime Sickle", "slime_sickle");
        this.modifyCustomItem((CustomTool)this, new RecipeIngredient(Material.SLIME_BALL));
    }
    
    @Override
    public int getBreakRadius() {
        return 1;
    }
}

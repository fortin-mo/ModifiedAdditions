// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.sickles;

import com.chrismin13.additionsapi.items.CustomTool;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import com.modified.modifiedadditions.abilities.SickleAbilities;
import com.modified.modifiedadditions.items.netherrack.NetherrackItem;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class NetherrackSickle extends NetherrackItem implements SickleAbilities
{
    public NetherrackSickle() {
        super(DamageableItem.STONE_HOE, "modified_additions:netherrack_sickle", "Netherrack Sickle", "netherrack_sickle");
        this.modifyCustomItem((CustomTool)this, new RecipeIngredient(Material.NETHERRACK));
    }
    
    @Override
    public int getBreakRadius() {
        return 2;
    }
}

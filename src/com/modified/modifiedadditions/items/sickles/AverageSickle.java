// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.sickles;

import com.modified.modifiedadditions.abilities.SickleAbilities;
import com.modified.modifiedadditions.durability.SickleDurability;
import org.bukkit.Material;
import com.chrismin13.additionsapi.durability.ItemDurability;
import com.chrismin13.additionsapi.items.CustomTool;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import us.fihgu.toolbox.item.DamageableItem;
import com.modified.modifiedadditions.items.AverageTexturedTool;

public abstract class AverageSickle extends AverageTexturedTool implements SickleAbilities
{
    public AverageSickle(final DamageableItem damageableItem, final int n, final String s, final String s2, final String s3, final RecipeIngredient craftingIngredient) {
        super(damageableItem, n, s, s2, s3);
        this.modifyCustomItem((CustomTool)this, craftingIngredient);
        this.setDurabilityMechanics((ItemDurability)new SickleDurability());
    }
    
    public AverageSickle(final DamageableItem damageableItem, final int n, final String s, final String s2, final String s3, final Material material) {
        this(damageableItem, n, s, s2, s3, new RecipeIngredient(material));
    }
}

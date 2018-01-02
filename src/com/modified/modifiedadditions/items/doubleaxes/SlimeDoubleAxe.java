// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.doubleaxes;

import com.comphenix.attribute.Attributes;
import com.chrismin13.additionsapi.recipes.CustomRecipe;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import com.modified.modifiedadditions.abilities.DoubleAxeAbilities;
import com.modified.modifiedadditions.items.slime.SlimeItem;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;

public class SlimeDoubleAxe extends SlimeItem implements DoubleAxeAbilities
{
    public SlimeDoubleAxe() {
        super(DamageableItem.WOODEN_AXE, "modified_additions:slime_double_axe", "Slime Double Axe", "slime_double_axe");
        this.addCustomRecipe((CustomRecipe)this.getRecipe(new RecipeIngredient(Material.SLIME_BALL), new RecipeIngredient(Material.STICK)));
        for (final Attributes.Attribute attribute : this.getAttributes()) {
            if (attribute.getAttributeType().equals(Attributes.AttributeType.GENERIC_ATTACK_SPEED)) {
                attribute.setAmount(this.getAttackSpeed(this.getMaterial()) - 4.0);
            }
        }
    }
}

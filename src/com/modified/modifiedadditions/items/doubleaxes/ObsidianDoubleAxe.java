// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.doubleaxes;

import com.comphenix.attribute.Attributes;
import com.chrismin13.additionsapi.recipes.CustomRecipe;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import com.modified.modifiedadditions.abilities.DoubleAxeAbilities;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;
import com.modified.modifiedadditions.items.obsidian.ObsidianItem;

public class ObsidianDoubleAxe extends ObsidianItem implements DoubleAxeAbilities
{
    public ObsidianDoubleAxe() {
        super(DamageableItem.IRON_AXE, "modified_additions:obsidian_double_axe", "Obsidian Double Axe", "obsidian_double_axe");
        this.addCustomRecipe((CustomRecipe)this.getRecipe(new RecipeIngredient(Material.OBSIDIAN), new RecipeIngredient(Material.STICK)));
        for (final Attributes.Attribute attribute : this.getAttributes()) {
            if (attribute.getAttributeType().equals(Attributes.AttributeType.GENERIC_ATTACK_SPEED)) {
                attribute.setAmount(this.getAttackSpeed(this.getMaterial()) - 4.0);
            }
        }
    }
}

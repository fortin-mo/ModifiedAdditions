// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items;

import com.chrismin13.additionsapi.recipes.CustomRecipe;
import org.bukkit.Material;
import com.chrismin13.additionsapi.recipes.CustomShapedRecipe;
import org.bukkit.inventory.EquipmentSlot;
import com.comphenix.attribute.Attributes;
import us.fihgu.toolbox.item.DamageableItem;
import com.chrismin13.additionsapi.items.textured.CustomTexturedItem;

public class SlimeBucket extends CustomTexturedItem
{
    public SlimeBucket() {
        super(DamageableItem.DIAMOND_HOE, "modified_additions:slime_bucket", "slime_bucket");
        this.addTexture("jumping_slime_bucket");
        this.setUnbreakable(true);
        this.setDisplayName("Slime Bucket");
        this.setHoeAbilities(false);
        this.addAttribute(Attributes.AttributeType.GENERIC_ATTACK_DAMAGE, 1.0, EquipmentSlot.HAND, Attributes.Operation.ADD_NUMBER);
        this.setAttributeVisibility(false);
        this.setUnbreakableVisibility(false);
        CustomShapedRecipe setIngredient = new CustomShapedRecipe().setIngredient('1', Material.SLIME_BALL).setIngredient('2', Material.BUCKET);
        this.addCustomRecipe((CustomRecipe)setIngredient.setShape("100", "100", "200"));
        this.addCustomRecipe((CustomRecipe)new CustomShapedRecipe(setIngredient).setShape("010", "010", "020"));
        this.addCustomRecipe((CustomRecipe)new CustomShapedRecipe(setIngredient).setShape("001", "001", "002"));
    }
}

package com.modified.modifiedadditions.items;

import com.chrismin13.additionsapi.recipes.CustomRecipe;
import org.bukkit.Material;
import com.chrismin13.additionsapi.recipes.CustomShapedRecipe;
import com.chrismin13.additionsapi.items.textured.CustomTexturedBow;

public class EnderBow extends CustomTexturedBow
{
    public EnderBow() {
        super(1, "modified_additions:ender_bow", "ender_bow");
        this.setDisplayName("Ender Bow");
        this.setUnbreakable(true);
        this.setUnbreakableVisibility(false);
        this.setFakeDurability(50);
        this.setEnchantable(true);
        this.setCombinedInCrafting(true);
        this.addCustomRecipe((CustomRecipe)new CustomShapedRecipe().setShape("020", "212", "020").setIngredient('1', Material.BOW).setIngredient('2', Material.ENDER_PEARL));
    }
}

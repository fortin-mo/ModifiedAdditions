// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items;

import org.bukkit.Material;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import org.bukkit.Color;
import com.chrismin13.additionsapi.enums.ArmorType;
import com.chrismin13.additionsapi.items.CustomLeatherArmor;

public class AverageLeatherArmor extends CustomLeatherArmor
{
    public AverageLeatherArmor(ArmorType armorType, int fakeDurability, String s, String displayName, Color color) {
        super(armorType, 1, (short)0, s, color);
        this.setDisplayName(displayName);
        this.setUnbreakable(true);
        this.setFakeDurability(fakeDurability);
        this.setEnchantable(true);
        this.setUnbreakableVisibility(false);
        this.setCombinedInCrafting(true);
    }
    
    public AverageLeatherArmor(ArmorType armorType, int n, String s, String s2, Color color, RecipeIngredient recipeIngredient) {
        this(armorType, n, s, s2, color);
        this.addAllCustomRecipes(this.getArmorType().getCustomShapedRecipe(recipeIngredient));
    }
    
    public AverageLeatherArmor(ArmorType armorType, int n, String s, String s2, Color color, RecipeIngredient recipeIngredient, double n2, double n3) {
        this(armorType, n, s, s2, color, recipeIngredient);
        this.addArmor(n2);
        this.addArmorToughness(n3);
    }
    
    public AverageLeatherArmor(ArmorType armorType, int n, String s, String s2, Color color, Material material) {
        this(armorType, n, s, s2, color);
        this.addAllCustomRecipes(this.getArmorType().getCustomShapedRecipe(material));
    }
    
    public AverageLeatherArmor(ArmorType armorType, int n, String s, String s2, Color color, Material material, double armor, double toughness) {
        this(armorType, n, s, s2, color, material);
        this.addArmor(armor);
        this.addArmorToughness(toughness);
    }
}

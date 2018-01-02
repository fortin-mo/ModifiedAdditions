// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.abilities;

import com.chrismin13.additionsapi.recipes.CustomShapedRecipe;
import com.chrismin13.additionsapi.recipes.CustomRecipe;
import com.chrismin13.additionsapi.utils.MaterialUtils;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import org.bukkit.Material;
import com.chrismin13.additionsapi.items.CustomTool;
import com.modified.modifiedadditions.utils.TreeFeller;
import com.chrismin13.additionsapi.items.CustomItemStack;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public interface DoubleAxeAbilities
{
    default void chopTree(final Player player, final Block block, final CustomItemStack cStack) {
        TreeFeller.chop(block, player, cStack);
    }
    
    default void modifyCustomItem(final CustomTool cTool, final Material craftingMaterial) {
        this.modifyCustomItem(cTool, new RecipeIngredient(craftingMaterial));
    }
    
    default void modifyCustomItem(final CustomTool cTool, final RecipeIngredient craftingIngredient) {
        cTool.getCustomRecipes().clear();
        cTool.addAttackSpeed((double)this.getAttackSpeed(cTool.getMaterial()));
        cTool.addAttackDamage((double)MaterialUtils.getBaseDamage(cTool.getMaterial()) + 0.75);
        cTool.addCustomRecipe((CustomRecipe)this.getRecipe(craftingIngredient, new RecipeIngredient(Material.STICK)));
    }
    
    default float getAttackSpeed(final Material material) {
        return MaterialUtils.getBaseSpeed(material) - 0.3f;
    }
    
    default CustomShapedRecipe getRecipe(final RecipeIngredient craftingIngredient, final RecipeIngredient recipeIngredient) {
        return new CustomShapedRecipe().setShape("111", "121", "020").setIngredient('1', craftingIngredient).setIngredient('2', recipeIngredient);
    }
}

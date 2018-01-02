// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.abilities;

import com.chrismin13.additionsapi.recipes.CustomShapedRecipe;
import com.chrismin13.additionsapi.permissions.ItemPermissions;
import com.modified.modifiedadditions.permissions.ChiselPermissions;
import com.chrismin13.additionsapi.recipes.CustomRecipe;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import com.chrismin13.additionsapi.items.CustomTool;
import org.bukkit.SandstoneType;
import org.bukkit.Material;
import org.bukkit.block.Block;

public interface ChiselAbilities
{
    default void convertToChiseled(final Block block) {
        final Material type = block.getType();
        final byte data = block.getData();
        if (type == Material.SANDSTONE) {
            if (data == 0) {
                block.setTypeIdAndData(Material.SANDSTONE.getId(), SandstoneType.GLYPHED.getData(), true);
            }
            else if (data == SandstoneType.GLYPHED.getData()) {
                block.setTypeIdAndData(Material.SANDSTONE.getId(), (byte)0, true);
            }
        }
        else if (type == Material.MONSTER_EGGS) {
            if (data == 2) {
                block.setTypeIdAndData(Material.MONSTER_EGGS.getId(), (byte)5, true);
            }
            else if (data == 5) {
                block.setTypeIdAndData(Material.MONSTER_EGGS.getId(), (byte)2, true);
            }
        }
        else if (type == Material.SMOOTH_BRICK) {
            if (data == 0) {
                block.setTypeIdAndData(Material.SMOOTH_BRICK.getId(), (byte)3, true);
            }
            else if (data == 3) {
                block.setTypeIdAndData(Material.SMOOTH_BRICK.getId(), (byte)0, true);
            }
        }
        else if (type == Material.QUARTZ_BLOCK) {
            if (data == 0) {
                block.setTypeIdAndData(Material.QUARTZ_BLOCK.getId(), (byte)1, true);
            }
            else if (data == 1) {
                block.setTypeIdAndData(Material.QUARTZ_BLOCK.getId(), (byte)0, true);
            }
        }
        else if (type == Material.RED_SANDSTONE) {
            if (data == 0) {
                block.setTypeIdAndData(Material.RED_SANDSTONE.getId(), (byte)1, true);
            }
            else if (data == 1) {
                block.setTypeIdAndData(Material.RED_SANDSTONE.getId(), (byte)0, true);
            }
        }
        else if (type.toString().endsWith("GLAZED_TERRACOTTA")) {
            if (data < 3) {
                block.setData((byte)(data + 1));
            }
            else {
                block.setData((byte)0);
            }
        }
    }
    
    default void modifyCustomItem(final CustomTool cTool, final Material craftingMaterial) {
        this.modifyCustomItem(cTool, new RecipeIngredient(craftingMaterial));
    }
    
    default void modifyCustomItem(final CustomTool cTool, final RecipeIngredient craftingIngredient) {
        cTool.getCustomRecipes().clear();
        cTool.addCustomRecipe((CustomRecipe)this.getRecipe(craftingIngredient, new RecipeIngredient(Material.STICK)));
        final ItemPermissions perm = cTool.getPermissions();
        cTool.setPermissions((ItemPermissions)new ChiselPermissions(perm.getPermissionPrefix(), perm.getType()));
    }
    
    default CustomShapedRecipe getRecipe(final RecipeIngredient craftingIngredient, final RecipeIngredient recipeIngredient) {
        return new CustomShapedRecipe().setShape(new String[] { "1", "2" }).setIngredient('1', craftingIngredient).setIngredient('2', recipeIngredient);
    }
}

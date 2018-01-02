// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.abilities;

import com.chrismin13.additionsapi.recipes.CustomRecipe;
import com.modified.modifiedadditions.utils.BlockUtils;
import org.bukkit.Material;
import com.chrismin13.additionsapi.recipes.CustomShapedRecipe;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import com.chrismin13.additionsapi.items.CustomTool;
import org.bukkit.World;
import java.util.List;
import org.bukkit.plugin.Plugin;
import com.modified.modifiedadditions.ModifiedAdditions;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.block.Block;
import com.chrismin13.additionsapi.items.CustomItemStack;

public interface SickleAbilities
{
    default void onUse(final CustomItemStack cStack, final Block block, final Player player) {
        final int m = block.getTypeId();
        if (m == 59 || m == 141 || m == 142 || m == 207) {
            player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 1.0f);
            final List<Block> blocks = BlockUtils.getSquareRadius(block, this.getBreakRadius());
            Long delay = 0L;
            final World world = block.getWorld();
            for (final Block b : blocks) {
                final int material = b.getTypeId();
                if (material == 59 || material == 141 || material == 142 || material == 207) {
                    ++delay;
                    cStack.reduceDurability(player, cStack.getCustomItem().getDurabilityMechanics().getBlockBreak(block));
                    Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin) ModifiedAdditions.getInstance(), () -> {
                        if (b.getTypeId() == material) {
                            b.breakNaturally();
                            world.playSound(b.getLocation(), Sound.BLOCK_GRASS_BREAK, 1.0f, 1.0f);
                        }
                    }, (long)delay);
                }
            }
        }
    }
    
    default void modifyCustomItem(final CustomTool cTool, final RecipeIngredient craftingIngredient) {
        cTool.getCustomRecipes().clear();
        cTool.setHoeAbilities(false);
        cTool.addCustomRecipe((CustomRecipe)new CustomShapedRecipe().setShape("010", "001", "210").setIngredient('1', craftingIngredient).setIngredient('2', Material.STICK));
        cTool.addCustomRecipe((CustomRecipe)new CustomShapedRecipe().setShape("010", "100", "012").setIngredient('1', craftingIngredient).setIngredient('2', Material.STICK));
    }
    
    int getBreakRadius();
}

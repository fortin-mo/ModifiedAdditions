// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.utils;

import com.modified.modifiedadditions.ModifiedAdditions;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.Sound;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import java.util.List;
import java.util.LinkedList;
import com.chrismin13.additionsapi.items.CustomItemStack;
import org.bukkit.entity.Player;
import org.bukkit.block.Block;
import org.bukkit.plugin.java.JavaPlugin;

public class TreeFeller
{
    private static JavaPlugin plugin;
    
    static {
        TreeFeller.plugin = ModifiedAdditions.getInstance();
    }
    
    public static boolean chop(final Block block, final Player player, final CustomItemStack customItemStack) {
        final LinkedList<Block> list = new LinkedList<Block>();
        final Block highestLog = getHighestLog(block);
        if (isTree(highestLog, player, block)) {
            getBlocksToChop(block, highestLog, list);
            popLogs(list, block.getWorld(), player, customItemStack);
            return true;
        }
        return false;
    }
    
    public static void getBlocksToChop(Block relative, final Block block, final List<Block> list) {
        while (relative.getY() <= block.getY()) {
            if (!list.contains(relative)) {
                list.add(relative);
            }
            getBranches(relative, list, relative.getRelative(BlockFace.NORTH));
            getBranches(relative, list, relative.getRelative(BlockFace.NORTH_EAST));
            getBranches(relative, list, relative.getRelative(BlockFace.EAST));
            getBranches(relative, list, relative.getRelative(BlockFace.SOUTH_EAST));
            getBranches(relative, list, relative.getRelative(BlockFace.SOUTH));
            getBranches(relative, list, relative.getRelative(BlockFace.SOUTH_WEST));
            getBranches(relative, list, relative.getRelative(BlockFace.WEST));
            getBranches(relative, list, relative.getRelative(BlockFace.NORTH_WEST));
            if (!list.contains(relative.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH))) {
                getBranches(relative, list, relative.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH));
            }
            if (!list.contains(relative.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH_EAST))) {
                getBranches(relative, list, relative.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH_EAST));
            }
            if (!list.contains(relative.getRelative(BlockFace.UP).getRelative(BlockFace.EAST))) {
                getBranches(relative, list, relative.getRelative(BlockFace.UP).getRelative(BlockFace.EAST));
            }
            if (!list.contains(relative.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH_EAST))) {
                getBranches(relative, list, relative.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH_EAST));
            }
            if (!list.contains(relative.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH))) {
                getBranches(relative, list, relative.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH));
            }
            if (!list.contains(relative.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH_WEST))) {
                getBranches(relative, list, relative.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH_WEST));
            }
            if (!list.contains(relative.getRelative(BlockFace.UP).getRelative(BlockFace.WEST))) {
                getBranches(relative, list, relative.getRelative(BlockFace.UP).getRelative(BlockFace.WEST));
            }
            if (!list.contains(relative.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH_WEST))) {
                getBranches(relative, list, relative.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH_WEST));
            }
            if (relative.getData() == 3 || relative.getData() == 7 || relative.getData() == 11 || relative.getData() == 15) {
                if (!list.contains(relative.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH, 2))) {
                    getBranches(relative, list, relative.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH, 2));
                }
                if (!list.contains(relative.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH_EAST, 2))) {
                    getBranches(relative, list, relative.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH_EAST, 2));
                }
                if (!list.contains(relative.getRelative(BlockFace.UP).getRelative(BlockFace.EAST, 2))) {
                    getBranches(relative, list, relative.getRelative(BlockFace.UP).getRelative(BlockFace.EAST, 2));
                }
                if (!list.contains(relative.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH_EAST, 2))) {
                    getBranches(relative, list, relative.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH_EAST, 2));
                }
                if (!list.contains(relative.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH, 2))) {
                    getBranches(relative, list, relative.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH, 2));
                }
                if (!list.contains(relative.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH_WEST, 2))) {
                    getBranches(relative, list, relative.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH_WEST, 2));
                }
                if (!list.contains(relative.getRelative(BlockFace.UP).getRelative(BlockFace.WEST, 2))) {
                    getBranches(relative, list, relative.getRelative(BlockFace.UP).getRelative(BlockFace.WEST, 2));
                }
                if (!list.contains(relative.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH_WEST, 2))) {
                    getBranches(relative, list, relative.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH_WEST, 2));
                }
            }
            if ((list.contains(relative.getRelative(BlockFace.UP)) || relative.getRelative(BlockFace.UP).getType() != Material.LOG) && relative.getRelative(BlockFace.UP).getType() != Material.LOG_2) {
                break;
            }
            relative = relative.getRelative(BlockFace.UP);
        }
    }
    
    public static void getBranches(final Block block, final List<Block> list, final Block block2) {
        if (!list.contains(block2) && (block2.getType() == Material.LOG || block2.getType() == Material.LOG_2)) {
            getBlocksToChop(block2, getHighestLog(block2), list);
        }
    }
    
    public static Block getHighestLog(Block block) {
        boolean b = true;
        while (b) {
            if (block.getRelative(BlockFace.UP).getType().equals((Object)Material.LOG) || block.getRelative(BlockFace.UP).getType().equals((Object)Material.LOG_2) || block.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH).getType().equals((Object)Material.LOG) || block.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH).getType().equals((Object)Material.LOG_2) || block.getRelative(BlockFace.UP).getRelative(BlockFace.EAST).getType().equals((Object)Material.LOG) || block.getRelative(BlockFace.UP).getRelative(BlockFace.EAST).getType().equals((Object)Material.LOG_2) || block.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH).getType().equals((Object)Material.LOG) || block.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH).getType().equals((Object)Material.LOG_2) || block.getRelative(BlockFace.UP).getRelative(BlockFace.WEST).getType().equals((Object)Material.LOG) || block.getRelative(BlockFace.UP).getRelative(BlockFace.WEST).getType().equals((Object)Material.LOG_2) || block.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH_EAST).getType().equals((Object)Material.LOG) || block.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH_EAST).getType().equals((Object)Material.LOG_2) || block.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH_WEST).getType().equals((Object)Material.LOG) || block.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH_WEST).getType().equals((Object)Material.LOG_2) || block.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH_EAST).getType().equals((Object)Material.LOG) || block.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH_EAST).getType().equals((Object)Material.LOG_2) || block.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH_WEST).getType().equals((Object)Material.LOG) || block.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH_WEST).getType().equals((Object)Material.LOG_2)) {
                if (block.getRelative(BlockFace.UP).getType().equals((Object)Material.LOG) || block.getRelative(BlockFace.UP).getType().equals((Object)Material.LOG_2)) {
                    block = block.getRelative(BlockFace.UP);
                }
                else if (block.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH).getType().equals((Object)Material.LOG) || block.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH).getType().equals((Object)Material.LOG_2)) {
                    block = block.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH);
                }
                else if (block.getRelative(BlockFace.UP).getRelative(BlockFace.EAST).getType().equals((Object)Material.LOG) || block.getRelative(BlockFace.UP).getRelative(BlockFace.EAST).getType().equals((Object)Material.LOG_2)) {
                    block = block.getRelative(BlockFace.UP).getRelative(BlockFace.EAST);
                }
                else if (block.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH).getType().equals((Object)Material.LOG) || block.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH).getType().equals((Object)Material.LOG_2)) {
                    block = block.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH);
                }
                else if (block.getRelative(BlockFace.UP).getRelative(BlockFace.WEST).getType().equals((Object)Material.LOG) || block.getRelative(BlockFace.UP).getRelative(BlockFace.WEST).getType().equals((Object)Material.LOG_2)) {
                    block = block.getRelative(BlockFace.UP).getRelative(BlockFace.WEST);
                }
                else if (block.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH_EAST).getType().equals((Object)Material.LOG) || block.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH_EAST).getType().equals((Object)Material.LOG_2)) {
                    block = block.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH_EAST);
                }
                else if (block.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH_WEST).getType().equals((Object)Material.LOG) || block.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH_WEST).getType().equals((Object)Material.LOG_2)) {
                    block = block.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH_WEST);
                }
                else if (block.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH_EAST).getType().equals((Object)Material.LOG) || block.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH_EAST).getType().equals((Object)Material.LOG_2)) {
                    block = block.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH_EAST);
                }
                else {
                    if (!block.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH_WEST).getType().equals((Object)Material.LOG) && !block.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH_WEST).getType().equals((Object)Material.LOG_2)) {
                        continue;
                    }
                    block = block.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH_WEST);
                }
            }
            else {
                b = false;
            }
        }
        return block;
    }
    
    public static boolean isTree(Block relative, final Player player, final Block block) {
        int n = 0;
        if (relative.getRelative(BlockFace.UP).getType() == Material.LEAVES || relative.getRelative(BlockFace.UP).getType() == Material.LEAVES_2) {
            ++n;
        }
        if (relative.getRelative(BlockFace.UP).getRelative(BlockFace.UP).getType() == Material.LEAVES || relative.getRelative(BlockFace.UP).getRelative(BlockFace.UP).getType() == Material.LEAVES_2) {
            ++n;
        }
        if (relative.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH).getType() == Material.LEAVES || relative.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH).getType() == Material.LEAVES_2) {
            ++n;
        }
        if (relative.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH).getType() == Material.LEAVES || relative.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH).getType() == Material.LEAVES_2) {
            ++n;
        }
        if (relative.getRelative(BlockFace.UP).getRelative(BlockFace.EAST).getType() == Material.LEAVES || relative.getRelative(BlockFace.UP).getRelative(BlockFace.EAST).getType() == Material.LEAVES_2) {
            ++n;
        }
        if (relative.getRelative(BlockFace.UP).getRelative(BlockFace.WEST).getType() == Material.LEAVES || relative.getRelative(BlockFace.UP).getRelative(BlockFace.WEST).getType() == Material.LEAVES_2) {
            ++n;
        }
        if (relative.getRelative(BlockFace.DOWN).getType() == Material.LEAVES || relative.getRelative(BlockFace.DOWN).getType() == Material.LEAVES_2) {
            ++n;
        }
        if (relative.getRelative(BlockFace.NORTH).getType() == Material.LEAVES || relative.getRelative(BlockFace.NORTH).getType() == Material.LEAVES_2) {
            ++n;
        }
        if (relative.getRelative(BlockFace.EAST).getType() == Material.LEAVES || relative.getRelative(BlockFace.EAST).getType() == Material.LEAVES_2) {
            ++n;
        }
        if (relative.getRelative(BlockFace.SOUTH).getType() == Material.LEAVES || relative.getRelative(BlockFace.SOUTH).getType() == Material.LEAVES_2) {
            ++n;
        }
        if (relative.getRelative(BlockFace.WEST).getType() == Material.LEAVES || relative.getRelative(BlockFace.WEST).getType() == Material.LEAVES_2) {
            ++n;
        }
        if (n >= 2) {
            return true;
        }
        if (relative.getData() == 1) {
            relative = relative.getRelative(BlockFace.UP);
            if (relative.getRelative(BlockFace.UP).getType() == Material.LEAVES || relative.getRelative(BlockFace.UP).getType() == Material.LEAVES_2) {
                ++n;
            }
            if (relative.getRelative(BlockFace.UP).getRelative(BlockFace.UP).getType() == Material.LEAVES || relative.getRelative(BlockFace.UP).getRelative(BlockFace.UP).getType() == Material.LEAVES_2) {
                ++n;
            }
            if (relative.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH).getType() == Material.LEAVES || relative.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH).getType() == Material.LEAVES_2) {
                ++n;
            }
            if (relative.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH).getType() == Material.LEAVES || relative.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH).getType() == Material.LEAVES_2) {
                ++n;
            }
            if (relative.getRelative(BlockFace.UP).getRelative(BlockFace.EAST).getType() == Material.LEAVES || relative.getRelative(BlockFace.UP).getRelative(BlockFace.EAST).getType() == Material.LEAVES_2) {
                ++n;
            }
            if (relative.getRelative(BlockFace.UP).getRelative(BlockFace.WEST).getType() == Material.LEAVES || relative.getRelative(BlockFace.UP).getRelative(BlockFace.WEST).getType() == Material.LEAVES_2) {
                ++n;
            }
            if (relative.getRelative(BlockFace.NORTH).getType() == Material.LEAVES || relative.getRelative(BlockFace.NORTH).getType() == Material.LEAVES_2) {
                ++n;
            }
            if (relative.getRelative(BlockFace.EAST).getType() == Material.LEAVES || relative.getRelative(BlockFace.EAST).getType() == Material.LEAVES_2) {
                ++n;
            }
            if (relative.getRelative(BlockFace.SOUTH).getType() == Material.LEAVES || relative.getRelative(BlockFace.SOUTH).getType() == Material.LEAVES_2) {
                ++n;
            }
            if (relative.getRelative(BlockFace.WEST).getType() == Material.LEAVES || relative.getRelative(BlockFace.WEST).getType() == Material.LEAVES_2) {
                ++n;
            }
            if (n >= 2) {
                return true;
            }
        }
        return false;
    }
    
    public static void popLogs(List<Block> list, final World world, final Player player, final CustomItemStack customItemStack) {
        Long l = 0L;
        int n = 0;
        while (n < list.size()) {
            l = l + 1;
            Block block = list.get(n);
            Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)plugin, new Runnable(){

                @Override
                public void run() {
                	block.breakNaturally();
                    TreeFeller.popLeaves(block, customItemStack.getItemStack());
                    customItemStack.reduceDurability(player, customItemStack.getCustomItem().getDurabilityMechanics().getBlockBreak(block));
                    world.playSound(block.getLocation(), Sound.BLOCK_WOOD_BREAK, 1.0f, 1.0f);
                }
            }, l.longValue());
            ++n;
        }
    }
    
    public static void popLeaves(final Block block, final ItemStack itemStack) {
        Long n = 0L;
        for (int i = -3; i < 4; ++i) {
            for (int j = -3; j < 4; ++j) {
                for (int k = -3; k < 4; ++k) {
                    final Block relative = block.getRelative(j, i, k);
                    if (relative.getType().equals((Object)Material.LEAVES) || relative.getType().equals((Object)Material.LEAVES_2)) {
                        ++n;
                        Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)TreeFeller.plugin, (Runnable)new Runnable() {
                            @Override
                            public void run() {
                                relative.breakNaturally(itemStack);
                                relative.getWorld().playSound(relative.getLocation(), Sound.BLOCK_GRASS_BREAK, 0.125f, 1.0f);
                            }
                        }, n / 5L);
                    }
                }
            }
        }
    }
    
    public boolean isLoneLog(final Block block) {
        return block.getRelative(BlockFace.UP).getType() != Material.LOG && block.getRelative(BlockFace.UP).getType() != Material.LOG_2 && block.getRelative(BlockFace.DOWN).getType() == Material.AIR && !this.hasHorizontalCompany(block) && !this.hasHorizontalCompany(block.getRelative(BlockFace.UP)) && !this.hasHorizontalCompany(block.getRelative(BlockFace.DOWN));
    }
    
    public boolean hasHorizontalCompany(final Block block) {
        return block.getRelative(BlockFace.NORTH).getType() == Material.LOG || block.getRelative(BlockFace.NORTH).getType() == Material.LOG_2 || (block.getRelative(BlockFace.NORTH_EAST).getType() == Material.LOG || block.getRelative(BlockFace.NORTH_EAST).getType() == Material.LOG_2) || (block.getRelative(BlockFace.EAST).getType() == Material.LOG || block.getRelative(BlockFace.EAST).getType() == Material.LOG_2) || (block.getRelative(BlockFace.SOUTH_EAST).getType() == Material.LOG || block.getRelative(BlockFace.SOUTH_EAST).getType() == Material.LOG_2) || (block.getRelative(BlockFace.SOUTH).getType() == Material.LOG || block.getRelative(BlockFace.SOUTH).getType() == Material.LOG_2) || (block.getRelative(BlockFace.SOUTH_WEST).getType() == Material.LOG || block.getRelative(BlockFace.SOUTH_WEST).getType() == Material.LOG_2) || (block.getRelative(BlockFace.WEST).getType() == Material.LOG || block.getRelative(BlockFace.WEST).getType() == Material.LOG_2) || (block.getRelative(BlockFace.NORTH_WEST).getType() == Material.LOG || block.getRelative(BlockFace.NORTH_WEST).getType() == Material.LOG_2);
    }
}

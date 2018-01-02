// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.utils;

import org.bukkit.World;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.block.Block;

public class BlockUtils
{
    public static List<Block> getSquareRadius(final Block block, final int n) {
        final ArrayList<Block> list = new ArrayList<Block>();
        final World world = block.getWorld();
        final int x = block.getX();
        final int y = block.getY();
        final int z = block.getZ();
        for (int i = x - n; i < x + n; ++i) {
            for (int j = y - n; j < y + n; ++j) {
                for (int k = z - n; k < z + n; ++k) {
                    list.add(world.getBlockAt(i, j, k));
                }
            }
        }
        return list;
    }
}

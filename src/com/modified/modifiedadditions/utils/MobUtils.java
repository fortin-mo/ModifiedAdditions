// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.utils;

import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Slime;
import org.bukkit.Material;
import org.bukkit.Location;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Block;

public class MobUtils
{
    public static boolean spawnSlime(final Block block, final BlockFace blockFace) {
        double n = (double)block.getX();
        double n2 = (double)block.getY();
        double n3 = (double)block.getZ();
        final World world = block.getWorld();
        switch (blockFace) {
            case UP: {
                ++n2;
                break;
            }
            case DOWN: {
                --n2;
                break;
            }
            case EAST: {
                ++n;
                break;
            }
            case WEST: {
                --n;
                break;
            }
            case SOUTH: {
                ++n3;
                break;
            }
            case NORTH: {
                --n3;
                break;
            }
        }
        final Location location = new Location(world, (double)Double.valueOf(n + 0.5), (double)n2, (double)Double.valueOf(n3 + 0.5));
        final Block block2 = location.getBlock();
        if (block2.getType() != Material.AIR && !block2.isLiquid()) {
            return false;
        }
        ((Slime)world.spawnEntity(location, EntityType.SLIME)).setSize(1);
        return true;
    }
}

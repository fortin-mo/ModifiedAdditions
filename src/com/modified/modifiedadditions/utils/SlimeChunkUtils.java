// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.utils;

import org.bukkit.Chunk;
import org.bukkit.block.Biome;
import java.util.Random;
import org.bukkit.Location;

public class SlimeChunkUtils
{
    public static boolean isSlimeChunk(final Location location) {
        final Chunk chunk = location.getChunk();
        final int x = chunk.getX();
        final int z = chunk.getZ();
        return new Random(Long.valueOf(location.getWorld().getSeed()) + x * x * 4987142 + x * 5947611 + z * z * 4392871L + z * 389711 ^ 0x3AD8025FL).nextInt(10) == 0 || location.getBlock().getBiome().equals((Object)Biome.SWAMPLAND);
    }
}

package com.modified.modifiedadditions.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.Location;
import org.bukkit.block.Block;
import java.util.List;
import org.bukkit.Particle;
import org.bukkit.Material;
import org.bukkit.block.Biome;
import com.modified.modifiedadditions.Items;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.Listener;

public class SpongeListener implements Listener
{
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent blockPlaceEvent) {
        if (blockPlaceEvent.isCancelled())
            return;

        if (Items.config.getStringList("enabled-mechanics") == null)
            return;

        List stringList = Items.config.getStringList("enabled-mechanics");
        Block block = blockPlaceEvent.getBlock();
        Material type = block.getType();
        Biome biome = block.getBiome();
        Byte value = block.getData();
        if (biome == Biome.HELL && stringList.contains("WET_SPONGE_TO_SPONGE") && type == Material.SPONGE && value == 1) {
            block.setData((byte)0, true);
            Location location = block.getLocation();
            block.getWorld().spawnParticle(Particle.SMOKE_LARGE, location.getX() - 0.5, location.getY() + 0.5, location.getZ() + 0.5, 10);
        }
    }
}

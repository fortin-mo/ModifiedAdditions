package com.modified.modifiedadditions.listeners;

import com.modified.modifiedadditions.ModifiedAdditions;
import com.modified.modifiedadditions.items.EnderBow;
import org.bukkit.plugin.Plugin;
import org.bukkit.Bukkit;
import org.bukkit.event.player.PlayerPickupArrowEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Entity;
import org.bukkit.Location;
import org.bukkit.entity.Arrow;
import com.chrismin13.additionsapi.events.bow.ArrowFromCustomBowHitEvent;
import java.util.ArrayList;
import org.bukkit.entity.Projectile;
import java.util.List;
import org.bukkit.event.Listener;

public class EnderBowListener implements Listener
{
    private List<Projectile> unpickableArrows;
    
    public EnderBowListener() {
        this.unpickableArrows = new ArrayList<Projectile>();
    }
    
    @EventHandler
    public void onArrowHitFromCustomBow(ArrowFromCustomBowHitEvent arrowFromCustomBowHitEvent) {
        if (arrowFromCustomBowHitEvent.getCustomBow() instanceof EnderBow) {
            LivingEntity shooter = arrowFromCustomBowHitEvent.getShooter();
            Location eyeLocation = shooter.getEyeLocation();
            Arrow arrow = (Arrow)arrowFromCustomBowHitEvent.getProjectileHitEvent().getEntity();
            Location location = arrow.getLocation();
            this.unpickableArrows.add((Projectile)arrow);
            shooter.teleport(new Location(location.getWorld(), location.getX(), location.getY(), location.getZ(), eyeLocation.getYaw(), eyeLocation.getPitch()));
            shooter.damage(5.0, (Entity)arrow);
            this.checkTimeLived(arrow);
        }
    }
    
    @EventHandler
    public void onArrowPickup(PlayerPickupArrowEvent playerPickupArrowEvent) {
        if (this.unpickableArrows.contains(playerPickupArrowEvent.getArrow())) {
            playerPickupArrowEvent.setCancelled(true);
        }
    }
    
    public void checkTimeLived(Arrow arrow) {
        if (arrow != null) {
            if (arrow.getTicksLived() >= 6000 || arrow.isDead() || !arrow.isValid()) {
                if (this.unpickableArrows.contains(arrow)) {
                    this.unpickableArrows.remove(arrow);
                }
            }
            else {
                Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin) ModifiedAdditions.getInstance(), () -> this.checkTimeLived(arrow), 6000L);
            }
        }
    }
}

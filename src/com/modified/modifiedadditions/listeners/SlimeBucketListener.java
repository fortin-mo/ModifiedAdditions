// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.listeners;

import com.modified.modifiedadditions.items.SlimeBucket;
import com.modified.modifiedadditions.utils.MobUtils;
import com.modified.modifiedadditions.utils.SlimeChunkUtils;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.GameMode;
import org.bukkit.entity.Slime;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.entity.Item;
import com.chrismin13.additionsapi.items.CustomItemStack;
import com.chrismin13.additionsapi.AdditionsAPI;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.EventPriority;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerMoveEvent;
import java.util.ArrayList;
import java.util.Arrays;
import org.bukkit.Material;
import java.util.UUID;
import java.util.List;
import org.bukkit.event.Listener;

public class SlimeBucketListener implements Listener
{
    List<UUID> playersInSlimeChunks;
    static List<Material> interactables;
    
    static {
        SlimeBucketListener.interactables = Arrays.asList(Material.ACACIA_DOOR, Material.ACACIA_FENCE_GATE, Material.ANVIL, Material.BEACON, Material.BED, Material.BIRCH_DOOR, Material.BIRCH_FENCE_GATE, Material.BOAT, Material.BOAT_ACACIA, Material.BOAT_BIRCH, Material.BOAT_DARK_OAK, Material.BOAT_JUNGLE, Material.BOAT_SPRUCE, Material.BREWING_STAND, Material.COMMAND, Material.CHEST, Material.DARK_OAK_DOOR, Material.DARK_OAK_FENCE_GATE, Material.DAYLIGHT_DETECTOR, Material.DAYLIGHT_DETECTOR_INVERTED, Material.DISPENSER, Material.DROPPER, Material.ENCHANTMENT_TABLE, Material.ENDER_CHEST, Material.FENCE_GATE, Material.FURNACE, Material.HOPPER, Material.HOPPER_MINECART, Material.ITEM_FRAME, Material.JUNGLE_DOOR, Material.JUNGLE_FENCE_GATE, Material.LEVER, Material.MINECART, Material.NOTE_BLOCK, Material.POWERED_MINECART, Material.REDSTONE_COMPARATOR, Material.REDSTONE_COMPARATOR_OFF, Material.REDSTONE_COMPARATOR_ON, Material.SIGN, Material.SIGN_POST, Material.STORAGE_MINECART, Material.TRAP_DOOR, Material.TRAPPED_CHEST, Material.WALL_SIGN, Material.WOOD_BUTTON, Material.WOOD_DOOR, Material.WORKBENCH);
    }
    
    public SlimeBucketListener() {
        this.playersInSlimeChunks = new ArrayList<UUID>();
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerMove(PlayerMoveEvent playerMoveEvent) {
        if (playerMoveEvent.isCancelled()) {
            return;
        }
        Player player = playerMoveEvent.getPlayer();
        if (SlimeChunkUtils.isSlimeChunk(player.getLocation())) {
            this.changeToJumping(player);
        }
        else {
            this.changeToSimple(player);
        }
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onItemDrop(PlayerDropItemEvent playerDropItemEvent) {
        if (playerDropItemEvent.isCancelled()) {
            return;
        }
        Item itemDrop = playerDropItemEvent.getItemDrop();
        ItemStack itemStack = itemDrop.getItemStack();
        if (!AdditionsAPI.isCustomItem(itemStack)) {
            return;
        }
        CustomItemStack customItemStack = new CustomItemStack(itemStack);
        if (!(customItemStack.getCustomItem() instanceof SlimeBucket)) {
            return;
        }
        customItemStack.setTexture("slime_bucket");
        itemDrop.setItemStack(customItemStack.getItemStack());
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onItemPickup(PlayerPickupItemEvent playerPickupItemEvent) {
        if (playerPickupItemEvent.isCancelled()) {
            return;
        }
        Item item = playerPickupItemEvent.getItem();
        ItemStack itemStack = item.getItemStack();
        if (!AdditionsAPI.isCustomItem(itemStack)) {
            return;
        }
        CustomItemStack customItemStack = new CustomItemStack(itemStack);
        if (!(customItemStack.getCustomItem() instanceof SlimeBucket)) {
            return;
        }
        Player player = playerPickupItemEvent.getPlayer();
        if (SlimeChunkUtils.isSlimeChunk(player.getLocation())) {
            this.changeToJumping(player);
            customItemStack.setTexture("jumping_slime_bucket");
        }
        else {
            this.changeToSimple(player);
            customItemStack.setTexture("slime_bucket");
        }
        item.setItemStack(customItemStack.getItemStack());
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onSlimeBucketMove(InventoryMoveItemEvent inventoryMoveItemEvent) {
        if (inventoryMoveItemEvent.isCancelled()) {
            return;
        }
        ItemStack item = inventoryMoveItemEvent.getItem();
        if (!AdditionsAPI.isCustomItem(item)) {
            return;
        }
        CustomItemStack customItemStack = new CustomItemStack(item);
        if (!(customItemStack.getCustomItem() instanceof SlimeBucket)) {
            return;
        }
        customItemStack.setTexture("slime_bucket");
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBucketSlimeClick(PlayerInteractEntityEvent playerInteractEntityEvent) {
        if (playerInteractEntityEvent.isCancelled()) {
            return;
        }
        Entity rightClicked = playerInteractEntityEvent.getRightClicked();
        Player player = playerInteractEntityEvent.getPlayer();
        PlayerInventory inventory = player.getInventory();
        UUID uniqueId = player.getUniqueId();
        if (rightClicked instanceof Slime && (inventory.getItemInMainHand().getType().equals((Object)Material.BUCKET) || inventory.getItemInOffHand().getType().equals((Object)Material.BUCKET))) {
            if (rightClicked.isDead()) {
                return;
            }
            if (((Slime)rightClicked).getSize() != 1) {
                return;
            }
            if (player.getGameMode() != GameMode.CREATIVE) {
                if (inventory.getItemInMainHand().getType().equals((Object)Material.BUCKET)) {
                    ItemStack itemInMainHand = inventory.getItemInMainHand();
                    itemInMainHand.setAmount(itemInMainHand.getAmount() - 1);
                    inventory.setItemInMainHand(itemInMainHand);
                }
                else if (inventory.getItemInOffHand().getType().equals((Object)Material.BUCKET)) {
                    ItemStack itemInOffHand = inventory.getItemInOffHand();
                    itemInOffHand.setAmount(itemInOffHand.getAmount() - 1);
                    inventory.setItemInOffHand(itemInOffHand);
                }
            }
            if (SlimeChunkUtils.isSlimeChunk(player.getLocation())) {
                if (!this.playersInSlimeChunks.contains(uniqueId)) {
                    this.playersInSlimeChunks.add(uniqueId);
                }
                player.getInventory().addItem(new ItemStack[] { new CustomItemStack("modified_additions:slime_bucket").setTexture("jumping_slime_bucket").getItemStack() });
            }
            else {
                if (this.playersInSlimeChunks.contains(uniqueId)) {
                    this.playersInSlimeChunks.remove(uniqueId);
                }
                player.getInventory().addItem(new ItemStack[] { new CustomItemStack("modified_additions:slime_bucket").getItemStack() });
            }
            playerInteractEntityEvent.getRightClicked().remove();
        }
        else if (rightClicked instanceof ItemFrame) {
            if (((ItemFrame)rightClicked).getItem().getType() != Material.AIR) {
                return;
            }
            if (AdditionsAPI.isCustomItem(inventory.getItemInMainHand())) {
                CustomItemStack customItemStack = new CustomItemStack(inventory.getItemInMainHand());
                if (customItemStack.getCustomItem() instanceof SlimeBucket) {
                    customItemStack.setTexture("slime_bucket");
                }
            }
            else if (AdditionsAPI.isCustomItem(inventory.getItemInOffHand())) {
                CustomItemStack customItemStack2 = new CustomItemStack(inventory.getItemInOffHand());
                if (customItemStack2.getCustomItem() instanceof SlimeBucket) {
                    customItemStack2.setTexture("slime_bucket");
                }
            }
        }
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onInventoryChange(InventoryClickEvent inventoryClickEvent) {
        if (inventoryClickEvent.getView().getTopInventory() == null || inventoryClickEvent.isCancelled()) {
            return;
        }
        Inventory inventory = inventoryClickEvent.getInventory();
        ItemStack currentItem = inventoryClickEvent.getCurrentItem();
        if (inventory.getHolder() != null && inventory.getHolder().toString().contains("CraftPlayer")) {
            if (AdditionsAPI.isCustomItem(currentItem)) {
                CustomItemStack customItemStack = new CustomItemStack(currentItem);
                if (customItemStack.getCustomItem() instanceof SlimeBucket) {
                    if (SlimeChunkUtils.isSlimeChunk(inventoryClickEvent.getWhoClicked().getLocation())) {
                        customItemStack.setTexture("jumping_slime_bucket");
                    }
                    else {
                        customItemStack.setTexture("slime_bucket");
                    }
                }
            }
        }
        else if (AdditionsAPI.isCustomItem(currentItem)) {
            CustomItemStack customItemStack2 = new CustomItemStack(currentItem);
            if (customItemStack2.getCustomItem() instanceof SlimeBucket) {
                customItemStack2.setTexture("slime_bucket");
                this.playersInSlimeChunks.remove(inventoryClickEvent.getWhoClicked().getUniqueId());
            }
        }
    }
    
    @EventHandler
    public void onSlimeBucketBlockClick(PlayerInteractEvent playerInteractEvent) {
        if (playerInteractEvent.isCancelled()) {
            return;
        }
        Player player = playerInteractEvent.getPlayer();
        PlayerInventory inventory = player.getInventory();
        CustomItemStack customItemStack;
        if (AdditionsAPI.isCustomItem(inventory.getItemInMainHand())) {
            customItemStack = new CustomItemStack(inventory.getItemInMainHand());
        }
        else {
            if (!AdditionsAPI.isCustomItem(inventory.getItemInOffHand())) {
                return;
            }
            customItemStack = new CustomItemStack(inventory.getItemInOffHand());
        }
        if (!(customItemStack.getCustomItem() instanceof SlimeBucket)) {
            return;
        }
        if (playerInteractEvent.getAction() == Action.RIGHT_CLICK_BLOCK && (!SlimeBucketListener.interactables.contains(playerInteractEvent.getClickedBlock().getType()) || player.isSneaking())) {
            if (playerInteractEvent.getClickedBlock() == null) {
                return;
            }
            if (MobUtils.spawnSlime(playerInteractEvent.getClickedBlock(), playerInteractEvent.getBlockFace()) && !player.getGameMode().equals((Object)GameMode.CREATIVE)) {
                customItemStack.getItemStack().setAmount(0);
                inventory.addItem(new ItemStack[] { new ItemStack(Material.BUCKET) });
            }
        }
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onTeleportWithSlimeBucket(PlayerTeleportEvent playerTeleportEvent) {
        Player player = playerTeleportEvent.getPlayer();
        if (SlimeChunkUtils.isSlimeChunk(player.getLocation())) {
            this.changeToJumping(player);
        }
        else {
            this.changeToSimple(player);
        }
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onItemCraft(CraftItemEvent craftItemEvent) {
        if (craftItemEvent.isCancelled() || !AdditionsAPI.isCustomItem(craftItemEvent.getCurrentItem())) {
            return;
        }
        CustomItemStack customItemStack = new CustomItemStack(craftItemEvent.getCurrentItem());
        if (!(customItemStack.getCustomItem() instanceof SlimeBucket)) {
            return;
        }
        if (SlimeChunkUtils.isSlimeChunk(craftItemEvent.getWhoClicked().getLocation())) {
            customItemStack.setTexture("jumping_slime_bucket");
        }
        else {
            customItemStack.setTexture("slime_bucket");
        }
    }
    
    public void changeToJumping(Player player) {
        if (!this.playersInSlimeChunks.contains(player.getUniqueId())) {
            this.playersInSlimeChunks.add(player.getUniqueId());
        }
        ItemStack[] contents;
        for (int length = (contents = ((Inventory)player.getInventory()).getContents()).length, i = 0; i < length; ++i) {
            ItemStack itemStack = contents[i];
            if (AdditionsAPI.isCustomItem(itemStack)) {
                CustomItemStack customItemStack = new CustomItemStack(itemStack);
                if (customItemStack.getCustomItem() instanceof SlimeBucket) {
                    customItemStack.setTexture("jumping_slime_bucket");
                }
            }
        }
    }
    
    public void changeToSimple(Player player) {
        if (this.playersInSlimeChunks.contains(player.getUniqueId())) {
            this.playersInSlimeChunks.remove(player.getUniqueId());
        }
        ItemStack[] contents;
        for (int length = (contents = ((Inventory)player.getInventory()).getContents()).length, i = 0; i < length; ++i) {
            ItemStack itemStack = contents[i];
            if (AdditionsAPI.isCustomItem(itemStack)) {
                CustomItemStack customItemStack = new CustomItemStack(itemStack);
                if (customItemStack.getCustomItem() instanceof SlimeBucket) {
                    customItemStack.setTexture("slime_bucket");
                }
            }
        }
    }
}

package com.modified.modifiedadditions;

import com.modified.modifiedadditions.items.EnderBow;
import com.modified.modifiedadditions.items.SlimeBucket;
import com.modified.modifiedadditions.items.StoneArmor;
import com.modified.modifiedadditions.items.clay.ClayArmor;
import com.modified.modifiedadditions.items.clay.ClayAxe;
import com.modified.modifiedadditions.items.clay.ClayHoe;
import com.modified.modifiedadditions.items.clay.ClaySword;
import com.modified.modifiedadditions.items.coal.CoalArmor;
import com.modified.modifiedadditions.items.coal.CoalAxe;
import com.modified.modifiedadditions.items.coal.CoalPickaxe;
import com.modified.modifiedadditions.items.coal.CoalShovel;
import com.modified.modifiedadditions.items.emerald.*;
import com.modified.modifiedadditions.items.endstone.EndStoneArmor;
import com.modified.modifiedadditions.items.endstone.EndStoneAxe;
import com.modified.modifiedadditions.items.endstone.EndStonePickaxe;
import com.modified.modifiedadditions.items.endstone.EndStoneShovel;
import com.modified.modifiedadditions.items.lapis.LapisAxe;
import com.modified.modifiedadditions.items.lapis.LapisPickaxe;
import com.modified.modifiedadditions.items.lapis.LapisSword;
import com.modified.modifiedadditions.items.netherrack.NetherrackAxe;
import com.modified.modifiedadditions.items.netherrack.NetherrackHoe;
import com.modified.modifiedadditions.items.netherrack.NetherrackPickaxe;
import com.modified.modifiedadditions.items.netherrack.NetherrackShovel;
import com.modified.modifiedadditions.items.obsidian.ObsidianArmor;
import com.modified.modifiedadditions.items.obsidian.ObsidianHoe;
import com.modified.modifiedadditions.items.obsidian.ObsidianPickaxe;
import com.modified.modifiedadditions.items.obsidian.ObsidianShovel;
import com.modified.modifiedadditions.items.prismarine.PrismarinePickaxe;
import com.modified.modifiedadditions.items.prismarine.PrismarineShovel;
import com.modified.modifiedadditions.items.prismarine.PrismarineSword;
import com.modified.modifiedadditions.items.slime.SlimeAxe;
import com.modified.modifiedadditions.items.slime.SlimePickaxe;
import com.modified.modifiedadditions.items.slime.SlimeShovel;
import com.modified.modifiedadditions.items.slime.SlimeSword;
import com.modified.modifiedadditions.items.wood.WoodBasedItem;
import com.modified.modifiedadditions.listeners.CraftingRemover;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.event.EventHandler;
import java.util.Iterator;
import java.util.List;

import com.modified.modifiedadditions.items.chisels.WoodBasedChisel;
import com.modified.modifiedadditions.items.sickles.WoodBasedSickle;
import com.modified.modifiedadditions.items.doubleaxes.WoodBasedDoubleAxe;
import org.apache.commons.lang3.text.WordUtils;
import us.fihgu.toolbox.item.DamageableItem;
import com.modified.modifiedadditions.items.slime.SlimeArmor;
import com.modified.modifiedadditions.items.prismarine.PrismarineArmor;
import com.modified.modifiedadditions.items.redstone.RedstoneArmor;
import com.modified.modifiedadditions.items.lapis.LapisArmor;
import com.modified.modifiedadditions.items.netherrack.NetherrackArmor;
import com.chrismin13.additionsapi.enums.ArmorType;
import com.modified.modifiedadditions.items.chisels.DiamondChisel;
import com.modified.modifiedadditions.items.chisels.GoldChisel;
import com.modified.modifiedadditions.items.chisels.IronChisel;
import com.modified.modifiedadditions.items.chisels.StoneChisel;
import com.modified.modifiedadditions.items.sickles.DiamondSickle;
import com.modified.modifiedadditions.items.sickles.GoldSickle;
import com.modified.modifiedadditions.items.sickles.IronSickle;
import com.modified.modifiedadditions.items.sickles.StoneSickle;
import com.modified.modifiedadditions.items.doubleaxes.DiamondDoubleAxe;
import com.modified.modifiedadditions.items.doubleaxes.GoldDoubleAxe;
import com.modified.modifiedadditions.items.doubleaxes.IronDoubleAxe;
import com.modified.modifiedadditions.items.doubleaxes.StoneDoubleAxe;
import com.modified.modifiedadditions.items.chisels.SlimeChisel;
import com.modified.modifiedadditions.items.sickles.SlimeSickle;
import com.modified.modifiedadditions.items.doubleaxes.SlimeDoubleAxe;
import com.modified.modifiedadditions.items.slime.SlimeHoe;
import com.modified.modifiedadditions.items.sickles.ClaySickle;
import com.modified.modifiedadditions.items.doubleaxes.ClayDoubleAxe;
import com.modified.modifiedadditions.items.clay.ClayShovel;
import com.modified.modifiedadditions.items.clay.ClayPickaxe;
import com.modified.modifiedadditions.items.chisels.PrismarineChisel;
import com.modified.modifiedadditions.items.sickles.PrismarineSickle;
import com.modified.modifiedadditions.items.doubleaxes.PrismarineDoubleAxe;
import com.modified.modifiedadditions.items.prismarine.PrismarineHoe;
import com.modified.modifiedadditions.items.prismarine.PrismarineAxe;
import com.modified.modifiedadditions.items.chisels.RedstoneChisel;
import com.modified.modifiedadditions.items.sickles.RedstoneSickle;
import com.modified.modifiedadditions.items.doubleaxes.RedstoneDoubleAxe;
import com.modified.modifiedadditions.items.redstone.RedstoneHoe;
import com.modified.modifiedadditions.items.redstone.RedstoneShovel;
import com.modified.modifiedadditions.items.redstone.RedstonePickaxe;
import com.modified.modifiedadditions.items.redstone.RedstoneAxe;
import com.modified.modifiedadditions.items.redstone.RedstoneSword;
import com.modified.modifiedadditions.items.chisels.LapisChisel;
import com.modified.modifiedadditions.items.sickles.LapisSickle;
import com.modified.modifiedadditions.items.doubleaxes.LapisDoubleAxe;
import com.modified.modifiedadditions.items.lapis.LapisHoe;
import com.modified.modifiedadditions.items.lapis.LapisShovel;
import com.modified.modifiedadditions.items.chisels.CoalChisel;
import com.modified.modifiedadditions.items.sickles.CoalSickle;
import com.modified.modifiedadditions.items.doubleaxes.CoalDoubleAxe;
import com.modified.modifiedadditions.items.coal.CoalHoe;
import com.modified.modifiedadditions.items.coal.CoalSword;
import com.modified.modifiedadditions.items.chisels.NetherrackChisel;
import com.modified.modifiedadditions.items.sickles.NetherrackSickle;
import com.modified.modifiedadditions.items.doubleaxes.NetherrackDoubleAxe;
import com.modified.modifiedadditions.items.netherrack.NetherrackSword;
import com.modified.modifiedadditions.items.chisels.EndStoneChisel;
import com.modified.modifiedadditions.items.sickles.EndStoneSickle;
import com.modified.modifiedadditions.items.doubleaxes.EndStoneDoubleAxe;
import com.modified.modifiedadditions.items.endstone.EndStoneHoe;
import com.modified.modifiedadditions.items.endstone.EndStoneSword;
import com.modified.modifiedadditions.items.chisels.ObsidianChisel;
import com.modified.modifiedadditions.items.sickles.ObsidianSickle;
import com.modified.modifiedadditions.items.doubleaxes.ObsidianDoubleAxe;
import com.modified.modifiedadditions.items.obsidian.ObsidianAxe;
import com.modified.modifiedadditions.items.obsidian.ObsidianSword;
import com.modified.modifiedadditions.items.chisels.EmeraldChisel;
import com.modified.modifiedadditions.items.sickles.EmeraldSickle;
import com.modified.modifiedadditions.items.doubleaxes.EmeraldDoubleAxe;
import com.modified.modifiedadditions.items.AverageTexturedTool;
import org.bukkit.plugin.Plugin;
import org.bukkit.inventory.Recipe;
import java.util.Arrays;
import org.bukkit.Material;
import org.bukkit.Bukkit;
import com.chrismin13.additionsapi.events.AdditionsAPIInitializationEvent;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;

public class Items implements Listener
{
    public static FileConfiguration config;
    
    @EventHandler
    public void onInitialization(AdditionsAPIInitializationEvent additionsAPIInitializationEvent) {
        additionsAPIInitializationEvent.addResourcePackFromPlugin(ModifiedAdditions.getInstance(), "ModifiedAdditions-1.1.zip");
        Items.config = ModifiedAdditions.getInstance().getConfig();
        String version = Bukkit.getServer().getVersion();

        if (version.contains("1.9") || version.contains("1.10") || version.contains("1.11")) {

            List<Material> list = Arrays.asList(Material.WOOD_SWORD, Material.WOOD_AXE, Material.WOOD_PICKAXE, Material.WOOD_SPADE, Material.WOOD_HOE);
            Iterator recipeIterator = Bukkit.recipeIterator();

            while (recipeIterator.hasNext())
                if (list.contains(((ShapedRecipe) recipeIterator.next()).getResult().getType()))
                    recipeIterator.remove();

        } else {
            Bukkit.getPluginManager().registerEvents((Listener)new CraftingRemover(), (Plugin) ModifiedAdditions.getInstance());
        }

        Iterator<AverageTexturedTool> iterator = Arrays.asList(new EmeraldSword(), new EmeraldAxe(), new EmeraldPickaxe(), new EmeraldShovel(), new EmeraldHoe(), new EmeraldDoubleAxe(), new EmeraldSickle(), new EmeraldChisel(), new ObsidianSword(), new ObsidianAxe(), new ObsidianPickaxe(), new ObsidianShovel(), new ObsidianHoe(), new ObsidianDoubleAxe(), new ObsidianSickle(), new ObsidianChisel(), new EndStoneSword(), new EndStoneAxe(), new EndStonePickaxe(), new EndStoneShovel(), new EndStoneHoe(), new EndStoneDoubleAxe(), new EndStoneSickle(), new EndStoneChisel(), new NetherrackSword(), new NetherrackAxe(), new NetherrackPickaxe(), new NetherrackShovel(), new NetherrackHoe(), new NetherrackDoubleAxe(), new NetherrackSickle(), new NetherrackChisel(), new CoalSword(), new CoalAxe(), new CoalPickaxe(), new CoalShovel(), new CoalHoe(), new CoalDoubleAxe(), new CoalSickle(), new CoalChisel(), new LapisSword(), new LapisAxe(), new LapisPickaxe(), new LapisShovel(), new LapisHoe(), new LapisDoubleAxe(), new LapisSickle(), new LapisChisel(), new RedstoneSword(), new RedstoneAxe(), new RedstonePickaxe(), new RedstoneShovel(), new RedstoneHoe(), new RedstoneDoubleAxe(), new RedstoneSickle(), new RedstoneChisel(), new PrismarineSword(), new PrismarineAxe(), new PrismarinePickaxe(), new PrismarineShovel(), new PrismarineHoe(), new PrismarineDoubleAxe(), new PrismarineSickle(), new PrismarineChisel(), new ClaySword(), new ClayAxe(), new ClayPickaxe(), new ClayShovel(), new ClayHoe(), new ClayDoubleAxe(), new ClaySickle(), new ClaySickle(), new SlimeSword(), new SlimeAxe(), new SlimePickaxe(), new SlimeShovel(), new SlimeHoe(), new SlimeDoubleAxe(), new SlimeSickle(), new SlimeChisel(), new StoneDoubleAxe(), new IronDoubleAxe(), new GoldDoubleAxe(), new DiamondDoubleAxe(), new StoneSickle(), new IronSickle(), new GoldSickle(), new DiamondSickle(), new StoneChisel(), new IronChisel(), new GoldChisel(), new DiamondChisel()).iterator();
        while (iterator.hasNext())
            additionsAPIInitializationEvent.addCustomItem(iterator.next());

        ArmorType[] values;
        for (int length = (values = ArmorType.values()).length, i = 0; i < length; ++i) {
            ArmorType armorType = values[i];
            additionsAPIInitializationEvent.addCustomItem(new EmeraldArmor(armorType));
            additionsAPIInitializationEvent.addCustomItem(new ObsidianArmor(armorType));
            additionsAPIInitializationEvent.addCustomItem(new StoneArmor(armorType));
            additionsAPIInitializationEvent.addCustomItem(new EndStoneArmor(armorType));
            additionsAPIInitializationEvent.addCustomItem(new NetherrackArmor(armorType));
            additionsAPIInitializationEvent.addCustomItem(new CoalArmor(armorType));
            additionsAPIInitializationEvent.addCustomItem(new LapisArmor(armorType));
            additionsAPIInitializationEvent.addCustomItem(new RedstoneArmor(armorType));
            additionsAPIInitializationEvent.addCustomItem(new PrismarineArmor(armorType));
            additionsAPIInitializationEvent.addCustomItem(new ClayArmor(armorType));
            additionsAPIInitializationEvent.addCustomItem(new SlimeArmor(armorType));
        }

        Iterator<String> iterator2 = Arrays.asList("oak;0;oak", "spruce;1;spruce", "birch;2;birch", "jungle;3;jungle", "acacia;4;acacia", "dark_oak;5;big_oak").iterator();
        while (iterator2.hasNext()) {

            String[] split = iterator2.next().split(";");
            for (DamageableItem damageableItem : Arrays.asList(
                    DamageableItem.WOODEN_SWORD,
                    DamageableItem.WOODEN_AXE,
                    DamageableItem.WOODEN_PICKAXE,
                    DamageableItem.WOODEN_SHOVEL,
                    DamageableItem.WOODEN_HOE)) {

                additionsAPIInitializationEvent.addCustomItem(new WoodBasedItem(damageableItem, Byte.parseByte(split[1]), split[0], String.valueOf(split[2]) + "_" + damageableItem.getTextureName(), WordUtils.capitalize(String.valueOf(split[0].replaceAll("_", " ").toLowerCase()) + " " + damageableItem.toString().replaceAll("_", " ").toLowerCase())));
            }

            additionsAPIInitializationEvent.addCustomItem(new WoodBasedDoubleAxe(Byte.parseByte(split[1]), split[0], String.valueOf(split[2]) + "_wood_double_axe", String.valueOf(WordUtils.capitalize(split[0].replaceAll("_", " ").toLowerCase())) + " Wooden Double Axe"));
            additionsAPIInitializationEvent.addCustomItem(new WoodBasedSickle(Byte.parseByte(split[1]), split[0], String.valueOf(split[2]) + "_wood_sickle", String.valueOf(WordUtils.capitalize(split[0].replaceAll("_", " ").toLowerCase())) + " Wooden Sickle"));
            additionsAPIInitializationEvent.addCustomItem(new WoodBasedChisel(Byte.parseByte(split[1]), split[0], String.valueOf(split[2]) + "_wood_chisel", String.valueOf(WordUtils.capitalize(split[0].replaceAll("_", " ").toLowerCase())) + " Wooden Chisel"));
        }

        additionsAPIInitializationEvent.addCustomItem(new EnderBow());
        additionsAPIInitializationEvent.addCustomItem(new SlimeBucket());
        addCustomCraftingRecipes();
    }
    
    private static void addCustomCraftingRecipes() {
        List stringList = Items.config.getStringList("enabled-recipes");
        if (stringList.contains("SLABS_TO_FULL_BLOCKS")) {
            addHalfSlabCombo(Material.STEP, Material.STONE);
            addHalfSlabCombo(Material.STEP, 3, Material.COBBLESTONE);
            addHalfSlabCombo(Material.STEP, 4, Material.BRICK);
            addHalfSlabCombo(Material.STEP, 6, Material.NETHER_BRICK);
            addHalfSlabCombo(Material.WOOD_STEP, Material.WOOD);
            addHalfSlabCombo(Material.WOOD_STEP, 1, Material.WOOD, 1);
            addHalfSlabCombo(Material.WOOD_STEP, 2, Material.WOOD, 2);
            addHalfSlabCombo(Material.WOOD_STEP, 3, Material.WOOD, 3);
            addHalfSlabCombo(Material.WOOD_STEP, 4, Material.WOOD, 4);
            addHalfSlabCombo(Material.WOOD_STEP, 5, Material.WOOD, 5);
        }

        if (stringList.contains("CLAY_CONVERSION"))
            addSingleMaterialToItem(Material.CLAY, Material.CLAY_BALL, 4);


        if (stringList.contains("STAIRS_TO_BLOCKS")) {
            addFourMaterialsToItem(Material.WOOD_STAIRS, Material.WOOD, 2);
            addFourMaterialsToItem(Material.SPRUCE_WOOD_STAIRS, Material.WOOD, 1, 2);
            addFourMaterialsToItem(Material.BIRCH_WOOD_STAIRS, Material.WOOD, 2, 2);
            addFourMaterialsToItem(Material.JUNGLE_WOOD_STAIRS, Material.WOOD, 3, 2);
            addFourMaterialsToItem(Material.ACACIA_STAIRS, Material.WOOD, 4, 2);
            addFourMaterialsToItem(Material.DARK_OAK_STAIRS, Material.WOOD, 5, 2);
            addFourMaterialsToItem(Material.COBBLESTONE_STAIRS, Material.COBBLESTONE, 2);
            addFourMaterialsToItem(Material.BRICK_STAIRS, Material.BRICK, 2);
            addFourMaterialsToItem(Material.SMOOTH_STAIRS, Material.SMOOTH_BRICK, 2);
            addFourMaterialsToItem(Material.NETHER_BRICK_STAIRS, Material.NETHER_BRICK, 2);
            addFourMaterialsToItem(Material.SANDSTONE_STAIRS, Material.SANDSTONE, 2);
            addFourMaterialsToItem(Material.QUARTZ_STAIRS, Material.QUARTZ_BLOCK, 2);
            addFourMaterialsToItem(Material.RED_SANDSTONE_STAIRS, Material.RED_SANDSTONE, 2);
            addFourMaterialsToItem(Material.PURPUR_SLAB, Material.PURPUR_BLOCK, 2);
        }
    }
    
    public static void addHalfSlabCombo(Material material, Material material2) {
        addHalfSlabCombo(material, 1, 0, material2, 1, 0);
    }
    
    public static void addHalfSlabCombo(Material material, int n, Material material2) {
        addHalfSlabCombo(material, 1, n, material2, 1, 0);
    }
    
    public static void addHalfSlabCombo(Material material, int n, Material material2, int n2) {
        addHalfSlabCombo(material, 1, n, material2, 1, n2);
    }
    
    public static void addHalfSlabCombo(Material material, int n, int n2, Material material2, int n3, int n4) {
        ShapedRecipe shapedRecipe = new ShapedRecipe(new ItemStack(material2, n3, (short)n4));
        shapedRecipe.shape(new String[] { "1", "1" });
        shapedRecipe.setIngredient('1', material, n2);
        Bukkit.getServer().addRecipe((Recipe)shapedRecipe);
    }
    
    public static void addTwoItemsCombo(Material material, int n, Material material2, int n2, ItemStack itemStack) {
        ShapedRecipe shapedRecipe = new ShapedRecipe(itemStack);
        shapedRecipe.shape(new String[] { "1", "2" });
        shapedRecipe.setIngredient('1', material, n);
        shapedRecipe.setIngredient('2', material2, n2);
        Bukkit.getServer().addRecipe((Recipe)shapedRecipe);
    }
    
    public static void addTwoItemsCombo(Material material, Material material2, ItemStack itemStack) {
        addTwoItemsCombo(material, 0, material2, 0, itemStack);
    }
    
    public static void addSingleMaterialToItem(Material material, int n, ItemStack itemStack) {
        ShapedRecipe shapedRecipe = new ShapedRecipe(itemStack);
        shapedRecipe.shape(new String[] { "1" });
        shapedRecipe.setIngredient('1', material, n);
        Bukkit.getServer().addRecipe((Recipe)shapedRecipe);
    }
    
    public static void addSingleMaterialToItem(Material material, Material material2) {
        addSingleMaterialToItem(material, 0, new ItemStack(material2, 1, (short)0));
    }
    
    public static void addSingleMaterialToItem(Material material, int n, Material material2) {
        addSingleMaterialToItem(material, n, new ItemStack(material2, 1, (short)0));
    }
    
    public static void addSingleMaterialToItem(Material material, int n, Material material2, int n2) {
        addSingleMaterialToItem(material, n, new ItemStack(material2, 1, (short)n2));
    }
    
    public static void addSingleMaterialToItem(Material material, Material material2, int n, int n2) {
        addSingleMaterialToItem(material, 0, new ItemStack(material2, n2, (short)n));
    }
    
    public static void addSingleMaterialToItem(Material material, int n, Material material2, int n2, int n3) {
        addSingleMaterialToItem(material, n, new ItemStack(material2, n3, (short)n2));
    }
    
    public static void addSingleMaterialToItem(Material material, Material material2, int n) {
        addSingleMaterialToItem(material, 0, new ItemStack(material2, n, (short)0));
    }
    
    public static void addStair(Material material, int n, ItemStack itemStack) {
        ShapedRecipe shapedRecipe = new ShapedRecipe(itemStack);
        shapedRecipe.shape(new String[] { "100", "110", "111" });
        shapedRecipe.setIngredient('1', material, n);
        Bukkit.getServer().addRecipe((Recipe)shapedRecipe);
        ShapedRecipe shapedRecipe2 = new ShapedRecipe(itemStack);
        shapedRecipe2.shape(new String[] { "001", "011", "111" });
        shapedRecipe2.setIngredient('1', material, n);
        Bukkit.getServer().addRecipe((Recipe)shapedRecipe2);
    }
    
    public static void addStair(Material material, Material material2) {
        addStair(material, 0, new ItemStack(material2, 1, (short)0));
    }
    
    public static void addStair(Material material, int n, Material material2) {
        addStair(material, n, new ItemStack(material2, 1, (short)0));
    }
    
    public static void addStair(Material material, int n, Material material2, int n2) {
        addStair(material, n, new ItemStack(material2, 1, (short)n2));
    }
    
    public static void addStair(Material material, Material material2, int n, int n2) {
        addStair(material, 0, new ItemStack(material2, n2, (short)n));
    }
    
    public static void addStair(Material material, int n, Material material2, int n2, int n3) {
        addStair(material, n, new ItemStack(material2, n3, (short)n2));
    }
    
    public static void addStair(Material material, Material material2, int n) {
        addStair(material, 0, new ItemStack(material2, n, (short)0));
    }
    
    public static void addFourMaterialsToItem(Material material, int n, ItemStack itemStack) {
        ShapedRecipe shapedRecipe = new ShapedRecipe(itemStack);
        shapedRecipe.shape(new String[] { "11", "11" });
        shapedRecipe.setIngredient('1', material, n);
        Bukkit.getServer().addRecipe((Recipe)shapedRecipe);
    }
    
    public static void addFourMaterialsToItem(Material material, Material material2) {
        addFourMaterialsToItem(material, 0, new ItemStack(material2, 1, (short)0));
    }
    
    public static void addFourMaterialsToItem(Material material, int n, Material material2) {
        addFourMaterialsToItem(material, n, new ItemStack(material2, 1, (short)0));
    }
    
    public static void addFourMaterialsToItem(Material material, int n, Material material2, int n2) {
        addFourMaterialsToItem(material, n, new ItemStack(material2, 1, (short)n2));
    }
    
    public static void addFourMaterialsToItem(Material material, Material material2, int n, int n2) {
        addFourMaterialsToItem(material, 0, new ItemStack(material2, n2, (short)n));
    }
    
    public static void addFourMaterialsToItem(Material material, int n, Material material2, int n2, int n3) {
        addFourMaterialsToItem(material, n, new ItemStack(material2, n3, (short)n2));
    }
    
    public static void addFourMaterialsToItem(Material material, Material material2, int n) {
        addFourMaterialsToItem(material, 0, new ItemStack(material2, n, (short)0));
    }
    
    public static ItemStack increaseAmount(ItemStack itemStack, int amount) {
        itemStack.setAmount(amount);
        return itemStack;
    }
    
    public static void addFullTableToItem(Material material, int n, ItemStack itemStack) {
        ShapedRecipe shapedRecipe = new ShapedRecipe(itemStack);
        shapedRecipe.shape(new String[] { "111", "111", "111" });
        shapedRecipe.setIngredient('1', material, n);
        Bukkit.getServer().addRecipe((Recipe)shapedRecipe);
    }
    
    public static void addFullTableToItem(Material material, Material material2) {
        addFullTableToItem(material, 0, new ItemStack(material2, 1, (short)0));
    }
    
    public static void addFullTableToItem(Material material, int n, Material material2) {
        addFullTableToItem(material, n, new ItemStack(material2, 1, (short)0));
    }
    
    public static void addFullTableToItem(Material material, int n, Material material2, int n2) {
        addFullTableToItem(material, n, new ItemStack(material2, 1, (short)n2));
    }
    
    public static void addFullTableToItem(Material material, Material material2, int n, int n2) {
        addFullTableToItem(material, 0, new ItemStack(material2, n2, (short)n));
    }
    
    public static void addFullTableToItem(Material material, int n, Material material2, int n2, int n3) {
        addFullTableToItem(material, n, new ItemStack(material2, n3, (short)n2));
    }
    
    public static void addFullTableToItem(Material material, Material material2, int n) {
        addFullTableToItem(material, 0, new ItemStack(material2, n, (short)0));
    }
    
    public static void addFullTableToItem(ItemStack itemStack, ItemStack itemStack2) {
        addFullTableToItem(itemStack.getType(), itemStack.getDurability(), itemStack2);
    }
    
    public static void addFullTableToItem(ItemStack itemStack, Material material) {
        addFullTableToItem(itemStack.getType(), itemStack.getDurability(), new ItemStack(material, 1, (short)0));
    }
    
    public static void addFullTableToItem(ItemStack itemStack, Material material, int n) {
        addFullTableToItem(itemStack.getType(), itemStack.getDurability(), new ItemStack(material, n, (short)0));
    }
}

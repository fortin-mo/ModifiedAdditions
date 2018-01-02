// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions;

import java.util.List;
import java.io.IOException;
import com.chrismin13.additionsapi.utils.Debug;
import org.bukkit.configuration.file.YamlConfiguration;
import java.io.File;
import org.bukkit.plugin.PluginManager;
import com.modified.modifiedadditions.listeners.ArmorStandListener;
import com.modified.modifiedadditions.listeners.ChiselListener;
import com.modified.modifiedadditions.listeners.SpongeListener;
import com.modified.modifiedadditions.listeners.RedstoneItemsListener;
import com.modified.modifiedadditions.listeners.LapisItemsListener;
import com.modified.modifiedadditions.listeners.CoalItemsListener;
import com.modified.modifiedadditions.listeners.NetherrackItemsListener;
import com.modified.modifiedadditions.listeners.SlimeBucketListener;
import com.modified.modifiedadditions.listeners.EnderBowListener;
import org.bukkit.plugin.Plugin;
import org.bukkit.event.Listener;
import com.modified.modifiedadditions.listeners.BlockBreakListener;
import org.bukkit.plugin.java.JavaPlugin;

public class ModifiedAdditions extends JavaPlugin
{
    private static JavaPlugin instance;
    
    public void onEnable() {
        ModifiedAdditions.instance = this;
        final PluginManager pluginManager = this.getServer().getPluginManager();
        pluginManager.registerEvents(new BlockBreakListener(), (Plugin)this);
        pluginManager.registerEvents(new EnderBowListener(), (Plugin)this);
        pluginManager.registerEvents(new Items(), (Plugin)this);
        pluginManager.registerEvents(new SlimeBucketListener(), (Plugin)this);
        pluginManager.registerEvents(new NetherrackItemsListener(), (Plugin)this);
        pluginManager.registerEvents(new CoalItemsListener(), (Plugin)this);
        pluginManager.registerEvents(new LapisItemsListener(), (Plugin)this);
        pluginManager.registerEvents(new RedstoneItemsListener(), (Plugin)this);
        pluginManager.registerEvents(new SpongeListener(), (Plugin)this);
        pluginManager.registerEvents(new ChiselListener(), (Plugin)this);
        pluginManager.registerEvents(new ArmorStandListener(), (Plugin)this);
        this.initializeConfig();
    }
    
    private void initializeConfig() {
        final String string = this.getDataFolder() + "\\config.yml";
        final YamlConfiguration loadConfiguration = YamlConfiguration.loadConfiguration(new File(string));
        boolean b = false;
        if (loadConfiguration.getInt("config-version") == 0) {
            loadConfiguration.set("config-version", (Object)1);
            final List stringList = loadConfiguration.getStringList("enabled-mechanics");
            stringList.add("ARMOR_STANDS_WITH_ARMS");
            stringList.add("ARMOR_STAND_ITEM_IN_OFF_HAND");
            loadConfiguration.set("enabled-mechanics", (Object)stringList);
            b = true;
        }
        if (b) {
            try {
                loadConfiguration.options().header("-------=======----- Modified Additions by mooffy -----=======------- #\n= #\n# If you want to enable or disable Custom Items, like Emerald Swords, use\n# the Configuration of the Additions API!\n= #\n-------=======-------====== Configuration File =====-------=======------- #\n-----=======-------=======-------=======-------=======-------=======----- #\n= #\n# config-version: This keeps track of the version of your Config. If new\n#                 values are added by default, this will increase.\n#                 DO NOT CHANGE - IT CHANGES BY ITSELF WHEN NEEDED!\n= #\n-----=======-------=======-------=======-------=======-------=======----- #\n= #\n# enabled-recipes: This is a list of the recipes that will be added. This\n#                  does not include Custom Items, you can configure them\n#                  in the Additions API Config. Valid values are:\n#                  - SLABS_TO_FULL_BLOCKS (Converts two slabs, one on top of\n#                    the other, to the regular block)\n#                  - CLAY_CONVERSION (Converts a Clay Block to 4 Clay Balls)\n#                  - STAIRS_TO_BLOCKS (Converts a grid of 2x2 of Stairs to\n#                    a full block)\n= #\n------=======-------=======-------=======-------=======-------=======----- #\n= #\n# enabled-mechanics: This is a list of the game mechanics that will be enabled.\n#                    This does not include Custom Items, you can configure them\n#                    in the Additions API Config. Valid values are:\n#                    - WET_SPONGE_TO_SPONGE (Convert Wet Sponge to normal,\n#                      dry Sponge when placed in the nether.\n#                    - ARMOR_STANDS_WITH_ARMS (Add hands when an Armor Stand\n#                      is spawned)\n#                    - ARMOR_STAND_ITEM_IN_OFF_HAND (Add an item in the off\n#                      hand of an Armor Stand by holding it in your Off Hand)\n= #\n------=======-------=======-------=======-------=======-------=======----- #");
                loadConfiguration.save(string);
            }
            catch (IOException ex) {
                Debug.sayError("Could not save config! Please check if the hard drive is full or the file is in use, e.g. Opened in another program, such as Notepad or Notepad++.");
                ex.printStackTrace();
            }
        }
        this.saveDefaultConfig();
    }
    
    public static JavaPlugin getInstance() {
        return ModifiedAdditions.instance;
    }
}

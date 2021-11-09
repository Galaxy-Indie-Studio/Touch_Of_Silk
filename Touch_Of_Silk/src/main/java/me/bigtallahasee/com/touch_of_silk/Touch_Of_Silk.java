package me.bigtallahasee.com.touch_of_silk;

import me.bigtallahasee.com.touch_of_silk.commands.TOSAcommands;
import me.bigtallahasee.com.touch_of_silk.commands.TOScommands;
import me.bigtallahasee.com.touch_of_silk.listeners.BuddingAmethystBreakEvent;
import me.bigtallahasee.com.touch_of_silk.utils.Logger;
import me.bigtallahasee.com.touch_of_silk.utils.methodholders.SystemMethodHolder;
import org.bukkit.ChatColor;

import org.bukkit.plugin.java.JavaPlugin;

public final class Touch_Of_Silk extends JavaPlugin {
    SystemMethodHolder systemMethodHolder;

    String author = "BigTallahasee";
    String title = "Touch of Silk";
    String version = "1.0";

    String month = "11";
    String day = "3";
    String year = "2021";
    String dateCreated = month + "/" + day + "/" + year;

    @Override
    public void onEnable() {

        Logger.log(Logger.LogLevel.SUCCESS,title + " " + version + " created by " + author);
        Logger.log(Logger.LogLevel.SUCCESS, "Created on " + dateCreated + "has started enabling!");

        Logger.log(Logger.LogLevel.SUCCESS, "Registering Events and Commands!");

        //Event Listeners
        getServer().getPluginManager().registerEvents(new BuddingAmethystBreakEvent(), this);

        //Registerd Command Executors
        try {
            getCommand("tosa").setExecutor(new TOSAcommands());
            getCommand("tos").setExecutor(new TOScommands());
        }catch (NullPointerException exception){
            systemMethodHolder.nullPointerExecption();
        }

        //Registered Command Tab Completers
        /*getCommand("tosa").setTabCompleter(new TOSAcommands());
        getCommand("tos").setTabCompleter(new TOScommands());*/



        getConfig().options().copyDefaults();
        saveDefaultConfig();

        //Update Checker (Change resource id and uncomment for 2nd Update)
        /*new UpdateChecker(this, 94047).getLatestVersion(version -> {
            if (this.getDescription().getVersion().equalsIgnoreCase(version)) {
                Logger.log(Logger.LogLevel.SUCCESS, ("Touch_Of_Silk is up to date!"));
            } else {
                Logger.log(Logger.LogLevel.OUTLINE, "*********************************************************************");
                Logger.log(Logger.LogLevel.WARNING, ("Touch_Of_Silk is outdated!"));
                Logger.log(Logger.LogLevel.WARNING, ("Newest version: " + version));
                Logger.log(Logger.LogLevel.WARNING, ("Your version: " + Settings.VERSION));
                Logger.log(Logger.LogLevel.WARNING, ("Please Update Here: " + Settings.PLUGIN_URL + UpdateChecker.resourceId));
                Logger.log(Logger.LogLevel.OUTLINE, "*********************************************************************");
            }
        });*/
        Logger.log(Logger.LogLevel.SUCCESS, title + " " + version + " created by " + author);
        Logger.log(Logger.LogLevel.SUCCESS, "Created on " + dateCreated + " has enabled successfully!");
        Logger.log(Logger.LogLevel.SUCCESS, "Enjoy :D");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Logger.log(Logger.LogLevel.SUCCESS, title + " " + version + "created by " + author);
        Logger.log(Logger.LogLevel.SUCCESS, "Created on " + dateCreated + "has successfully been disabled!");
        Logger.log(Logger.LogLevel.SUCCESS, "Goodbye, Enjoy your day!");
    }
}

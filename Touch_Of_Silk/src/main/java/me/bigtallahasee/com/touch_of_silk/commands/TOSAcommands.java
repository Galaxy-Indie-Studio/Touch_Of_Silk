package me.bigtallahasee.com.touch_of_silk.commands;

import me.bigtallahasee.com.touch_of_silk.Touch_Of_Silk;
import me.bigtallahasee.com.touch_of_silk.utils.methodholders.ChatMethodHolder;
import me.bigtallahasee.com.touch_of_silk.utils.methodholders.SystemMethodHolder;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;



public class TOSAcommands implements CommandExecutor {
    public static SystemMethodHolder systemMethodHolder;
    Plugin plugin = Touch_Of_Silk.getPlugin(Touch_Of_Silk.class);
    boolean isSpawnersEnabled;
    boolean isAmethystEnabled;
    Player player;

    ChatMethodHolder chatMethodHolder;



    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if(player.isOp() || player.hasPermission("tos.*" ) || player.hasPermission("tos.admin")){
            if(args.length >= 0){
                if(command.getName().equals("tosa")){
                    if(args[0].equalsIgnoreCase("reload")){
                        if(args[1].equalsIgnoreCase("config")) {
                            player.sendMessage(ChatColor.LIGHT_PURPLE +"-------------");
                            player.sendMessage(ChatColor.LIGHT_PURPLE +"| Touch of Silk |");
                            player.sendMessage(ChatColor.LIGHT_PURPLE +"-------------");
                            player.sendMessage(ChatColor.RED +"We have spotted a reload!");
                            player.sendMessage("");
                            player.sendMessage(ChatColor.RED +"This is not recommended!");
                            player.sendMessage("");
                            player.sendMessage(ChatColor.RED +"If reloading this plugin causes any issues please attempt");
                            player.sendMessage(ChatColor.RED +"restarting the server to fix the issue!");
                            player.sendMessage("");
                            player.sendMessage(ChatColor.RED +"If you are still in need of assistance do /support to ");
                            player.sendMessage(ChatColor.RED +"retrieve our Github and Discord!");

                            plugin.reloadConfig();

                            player.sendMessage(ChatColor.GREEN +"Touch of Silk has finished reloading!");
                        }
                    }
                    if(args[0].equalsIgnoreCase("disable") && !isAmethystEnabled){
                        if(args[1].equalsIgnoreCase("buddingamethyst")){

                            player.sendMessage(ChatColor.LIGHT_PURPLE +"-------------");
                            player.sendMessage(ChatColor.LIGHT_PURPLE +"| Touch of Silk |");
                            player.sendMessage(ChatColor.LIGHT_PURPLE +"-------------");
                            player.sendMessage(ChatColor.RED +"You have disabled players from");
                            player.sendMessage(ChatColor.RED +"silk touching Budding Amethyst!");

                            plugin.getConfig().set("Silk-Touch-Budding-Amethyst-Enabled", false);
                            isAmethystEnabled = false;
                        }else{
                            player.sendMessage(ChatColor.LIGHT_PURPLE +"-------------");
                            player.sendMessage(ChatColor.LIGHT_PURPLE +"| Touch of Silk |");
                            player.sendMessage(ChatColor.LIGHT_PURPLE +"-------------");
                            player.sendMessage(ChatColor.RED +"You have already disabled Silk Touching Budding Amethyst!");
                        }
                        if(args[1].equalsIgnoreCase("spawners") && !isSpawnersEnabled){
                            player.sendMessage(ChatColor.LIGHT_PURPLE +"-------------");
                            player.sendMessage(ChatColor.LIGHT_PURPLE +"| Touch of Silk |");
                            player.sendMessage(ChatColor.LIGHT_PURPLE +"-------------");
                            player.sendMessage(ChatColor.RED +"You have disabled players from");
                            player.sendMessage(ChatColor.RED +"silk touching Spawners!");

                            plugin.getConfig().set("Silk-Touch-Spawners-Enabled", false);
                            isSpawnersEnabled = false;
                        }else{
                            player.sendMessage(ChatColor.LIGHT_PURPLE +"-------------");
                            player.sendMessage(ChatColor.LIGHT_PURPLE +"| Touch of Silk |");
                            player.sendMessage(ChatColor.LIGHT_PURPLE +"-------------");
                            player.sendMessage(ChatColor.RED + "You have already disabled Silk Touching Spawners!");
                        }
                    }
                    if(args[0].equalsIgnoreCase("enable")) {
                        if (args[1].equalsIgnoreCase("buddingamethyst") && isAmethystEnabled) {
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "-------------");
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "| Touch of Silk |");
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "-------------");
                            player.sendMessage(ChatColor.RED + "You have enabled silk touching Budding Amethyst");

                            plugin.getConfig().set("Silk-Touch-Budding-Amethyst-Enabled", true);
                            isAmethystEnabled = true;
                        } else if (plugin.getConfig().getBoolean("Silk-Touch-Budding-Amethyst-Enabled", true)) {
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "-------------");
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "| Touch of Silk |");
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "-------------");
                            player.sendMessage(ChatColor.GREEN + "You have already enabled Silk Touching Budding Amethyst!");
                        }
                        if (args[1].equalsIgnoreCase("spawners") && isSpawnersEnabled) {
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "-------------");
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "| Touch of Silk |");
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "-------------");
                            player.sendMessage(ChatColor.RED + "You have enabled silk touching Spawners");

                            plugin.getConfig().set("Silk-Touch-Spawners-Enabled", true);
                            isSpawnersEnabled = true;
                        } else if (!plugin.getConfig().getBoolean("Silk-Touch-Budding-Spawners-Enabled", true)) {
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "-------------");
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "| Touch of Silk |");
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "-------------");
                            player.sendMessage(ChatColor.RED + "You have already disabled Silk Touching Budding Amethyst!");
                        }
                    }
                    if(args[0].equalsIgnoreCase("support")){
                        player.sendMessage(ChatColor.LIGHT_PURPLE +"-------------");
                        player.sendMessage(ChatColor.LIGHT_PURPLE +"| Touch of Silk |");
                        player.sendMessage(ChatColor.LIGHT_PURPLE +"-------------");
                        player.sendMessage(ChatColor.RED +"We do apologize that you are having issues!");
                        player.sendMessage("");
                        player.sendMessage(ChatColor.RED +"You can reach out to us on our Discord and Github!");
                        player.sendMessage(ChatColor.RED +"Discord : https://discord.gg/c9zCA4P");
                        player.sendMessage(ChatColor.RED +"Github : https://github.com/Galaxy-Indie-Studio/Touch_Of_Silk");
                    }else{
                        player.sendMessage(ChatColor.LIGHT_PURPLE +"-------------");
                        player.sendMessage(ChatColor.LIGHT_PURPLE +"| Touch of Silk |");
                        player.sendMessage(ChatColor.LIGHT_PURPLE +"-------------");
                        player.sendMessage(ChatColor.RED +"You must enter a proper arguement!");
                        player.sendMessage(ChatColor.RED +"EX. /tosa enable (buddingamethyst/spawners)!");
                        player.sendMessage(ChatColor.RED +"EX. /tosa reload config");
                    }
                }
            }
        }else{
            player.sendMessage(ChatColor.LIGHT_PURPLE +"-----------------");
            player.sendMessage(ChatColor.LIGHT_PURPLE +"| Touch of Silk |");
            player.sendMessage(ChatColor.LIGHT_PURPLE +"-----------------");
            player.sendMessage(ChatColor.RED +"You don't have the proper permission to");
            player.sendMessage(ChatColor.RED +"execute this command!");
            player.sendMessage(ChatColor.RED +"Required permission (tos.admin/tos.*)");
        }

        return true;
    }

    /*@Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        return null;
    }*/
}

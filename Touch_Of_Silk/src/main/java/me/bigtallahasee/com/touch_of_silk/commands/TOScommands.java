package me.bigtallahasee.com.touch_of_silk.commands;

import me.bigtallahasee.com.touch_of_silk.Touch_Of_Silk;
import me.bigtallahasee.com.touch_of_silk.utils.methodholders.ChatMethodHolder;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class TOScommands implements CommandExecutor {
    Player player;

    Plugin plugin = Touch_Of_Silk.getPlugin(Touch_Of_Silk.class);

    ChatMethodHolder chatMethodHolder;

    String creator = "BigTallahasee";
    String contributors = "";
    String version = "1.0";

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        if(player.isOp() || player.hasPermission("tos.admin") || player.hasPermission("tos.*") || player.hasPermission("tos.default")){
            if(args.length >= 0){
                if(command.getName().equals("tos")){
                    if(args[0].equalsIgnoreCase("status")){
                        player.sendMessage(ChatColor.LIGHT_PURPLE +"-----------------");
                        player.sendMessage(ChatColor.LIGHT_PURPLE +"| Touch of Silk |");
                        player.sendMessage(ChatColor.LIGHT_PURPLE +"-----------------");
                        player.sendMessage(ChatColor.GREEN +"Silk Touching Spawners Enabled: " +plugin.getConfig().get("Silk-Touch-Spawners-Enabled"));
                        player.sendMessage(ChatColor.GREEN +"Silk Touching Budding Amethyst Enabled: " +plugin.getConfig().get("Silk-Touch-Budding-Amethyst-Enabled"));
                    }
                    if(args[0].equalsIgnoreCase("info")){
                        player.sendMessage(ChatColor.LIGHT_PURPLE +"-----------------");
                        player.sendMessage(ChatColor.LIGHT_PURPLE +"| Touch of Silk |");
                        player.sendMessage(ChatColor.LIGHT_PURPLE +"-----------------");
                        player.sendMessage(ChatColor.GREEN +"This plugin was created by: " +creator);
                        player.sendMessage( ChatColor.GREEN +"Contributors: " + contributors);
                        player.sendMessage(ChatColor.GREEN +"Current Plugin version: " +version);
                    }
                }
            }
        }else{
            player.sendMessage(ChatColor.LIGHT_PURPLE +"-----------------");
            player.sendMessage(ChatColor.LIGHT_PURPLE +"| Touch of Silk |");
            player.sendMessage(ChatColor.LIGHT_PURPLE +"-----------------");
            player.sendMessage(ChatColor.RED +"You don't have the proper permission to");
            player.sendMessage(ChatColor.RED +"execute this command!");
            player.sendMessage(ChatColor.RED +"Required permission (tos.default/tos.*)");
        }
        return false;
    }

    /*@Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        return null;
    }*/
}

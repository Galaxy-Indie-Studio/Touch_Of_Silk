package me.bigtallahasee.com.touch_of_silk.utils.methodholders;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class SystemMethodHolder {

    public void nullPointerExecption(){
        System.out.println(ChatColor.LIGHT_PURPLE +"-----------------");
        System.out.println(ChatColor.LIGHT_PURPLE +"| Touch of Silk |");
        System.out.println(ChatColor.LIGHT_PURPLE +"-----------------");
        System.out.println(ChatColor.RED +"We have spotted a Null Pointer Exception!");
        System.out.println(ChatColor.RED +"Attempt restarting your server to resolve this issue!");
        System.out.println(ChatColor.RED +"If you are still having issues let us know on our Discord or Github!");
        System.out.println(ChatColor.RED +"Discord : https://discord.gg/c9zCA4P");
        System.out.println(ChatColor.RED +"Github : https://github.com/Galaxy-Indie-Studio/Touch_Of_Silk");
    }
}

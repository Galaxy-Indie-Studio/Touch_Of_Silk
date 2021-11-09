package me.bigtallahasee.com.touch_of_silk.listeners;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BuddingAmethystBreakEvent implements Listener {


    @EventHandler
    public static void onBlockBreak(BlockBreakEvent event) {
        if (!event.getBlock().getType().equals(Material.BUDDING_AMETHYST))
            return;
        if (!event.getPlayer().hasPermission("tos.amethyst") || !event.getPlayer().hasPermission("tos.*") || !event.getPlayer().isOp())
            return;
        if (event.getPlayer().getGameMode().equals(GameMode.CREATIVE))
            return;
        if (event.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.AIR))
            return;

        if (!event.getPlayer().getInventory().getItemInMainHand().getEnchantments().containsKey(Enchantment.SILK_TOUCH))
            return;

        event.setExpToDrop(0);
        event.setDropItems(false);
        Location loc = event.getBlock().getLocation();
        World world = event.getBlock().getWorld();

        world.dropItemNaturally(loc, new ItemStack(Material.BUDDING_AMETHYST));
    }
}

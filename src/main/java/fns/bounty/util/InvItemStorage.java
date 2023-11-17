package fns.bounty.util;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class InvItemStorage {

    public static void generateBountyMainMenu(Player player) {
        Inventory inv = Bukkit.createInventory(null, 27, StringUtils.GET_BOUNTY_INV_NAME);
        inv.setItem(0, InventoryUtils.getPersonalBountyMainMenuHead(player));
        player.openInventory(inv);
    }

}

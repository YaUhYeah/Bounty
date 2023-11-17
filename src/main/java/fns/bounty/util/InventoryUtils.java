package fns.bounty.util;

import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;
import java.util.List;

public class InventoryUtils {

    public static ItemStack getPersonalBountyMainMenuHead(Player player){
        ItemStack head = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta meta = (SkullMeta) head.getItemMeta();
        meta.setOwner(player.getName());
        meta.setDisplayName(StringUtils.colorize("&b&lYour Data"));
        List<String> lore = new ArrayList<>();
        lore.add(StringUtils.colorize("&7You have a bounty of: &e" + BountyUtils.getBountyForPlayer(player)));
        meta.setLore(lore);
        head.setItemMeta(meta);
        NBTItem item = new NBTItem(head);
        item.setString("PlayerBounty", player.getName());
        return item.getItem();
    }

}

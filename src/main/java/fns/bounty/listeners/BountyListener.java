package fns.bounty.listeners;

import fns.bounty.Bounty;
import fns.bounty.util.StringUtils;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import java.io.IOException;

public class BountyListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) throws IOException {
        Player player = e.getPlayer();
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(Bounty.getBounty().getPlayerFile(player.getUniqueId()));
        if (!cfg.contains("bounty")){
            cfg.set("bounty", 0);
            cfg.save(Bounty.getBounty().getPlayerFile(player.getUniqueId()));
        }
    }

    @EventHandler
    public void invClick(InventoryClickEvent e){
        if (e.getView().getTitle().contains(StringUtils.GET_BOUNTY_INV_NAME)){
            e.setCancelled(true);
        }
    }


}

package fns.bounty.util;

import fns.bounty.Bounty;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class BountyUtils {

    public static int getBountyForPlayer(Player player){
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(Bounty.getBounty().getPlayerFile(player.getUniqueId()));
        return cfg.getInt("bounty");
    }


}

package fns.bounty.util;

import fns.bounty.Bounty;
import org.bukkit.ChatColor;

public class StringUtils {

    public final static String GET_BOUNTY_INV_NAME = colorize(Bounty.getBounty().getConfig().getString("bounty-inv-name"));
    public static String getPrefix(){
        return colorize(Bounty.getBounty().getConfig().getString("prefix"));
    }

    public static String colorize(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

}

package fns.bounty.cmd;

import fns.bounty.util.InvItemStorage;
import fns.bounty.util.StringUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class BountyCmd implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage(StringUtils.getPrefix()+StringUtils.colorize("&cYou must be a player to use this command."));
            return false;
        }
        Player player = (Player) sender;
        InvItemStorage.generateBountyMainMenu(player);
        return false;
    }
}

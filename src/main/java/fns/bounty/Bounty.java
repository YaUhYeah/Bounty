package fns.bounty;

import fns.bounty.cmd.BountyCmd;
import fns.bounty.listeners.BountyListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.UUID;

public final class Bounty extends JavaPlugin {
    public static Bounty bounty;
    public File getPlayerFile(UUID uuid) {
        return new File(getDataFolder() + "/UserData/", uuid.toString() + ".yml");
    }

    @Override
    public void onLoad(){
        bounty = this;
    }

    @Override
    public void onEnable() {
        getCommand("bounty").setExecutor(new BountyCmd());
        Bukkit.getPluginManager().registerEvents(new BountyListener(),this);
    }

    @Override
    public void onDisable() {
    }

    public static Bounty getBounty() {
        return bounty;
    }
}

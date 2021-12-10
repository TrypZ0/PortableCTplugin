package com.trypzo.portablectplugin;

import com.trypzo.portablectplugin.events.PortableCTevents;
import com.trypzo.portablectplugin.items.ItemManager;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class PortableCTplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        ItemManager.init();
        getServer().getPluginManager().registerEvents(new PortableCTevents(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[PortableCTplugin] Plugin is ENABLED!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[PortableCTplugin] Plugin is DISABLED!");
    }


}

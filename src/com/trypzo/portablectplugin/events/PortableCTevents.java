package com.trypzo.portablectplugin.events;

import com.trypzo.portablectplugin.items.ItemManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;


public class PortableCTevents implements Listener {

    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getHand() == null || event.getHand().name().equalsIgnoreCase("OFF_HAND")) {
                return;
            }
            if (event.getItem() != null) {
                if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().equals(ItemManager.pct.getItemMeta())) {

                    event.getPlayer().openWorkbench(null, true);

                }
            }
        }
    }
}















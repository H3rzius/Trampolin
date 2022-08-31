package me.h3rzius.trampolin.events;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class TrampolinEvent extends PlayerMoveEvent {

    public TrampolinEvent(Player player, Location from, Location to) {
        super(player, from, to);
        onTrampoline(TrampolinEvent.this);
    }
    @EventHandler
    public void onTrampoline(PlayerMoveEvent event){
        Player p = event.getPlayer();
        Vector v = event.getPlayer().getLocation().getDirection();
        if(p.getLocation().subtract(0, 1, 0).getBlock().getType() == Material.GOLD_PLATE){
            p.setVelocity(new Vector(p.getVelocity().getX(), 2, p.getVelocity().getZ()));
        }
    }
}

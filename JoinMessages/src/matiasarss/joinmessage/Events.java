package matiasarss.joinmessage;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Events implements Listener {

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		Bukkit.broadcastMessage("§8[§a+§8]" + p.getName());
		p.sendMessage("§cBienvenido a el Servidor!");
		p.sendMessage("§cDiviertete con tus Amigos!");
		p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 1));
		
	}
	@EventHandler
	public void Ondeparture(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		Bukkit.broadcastMessage("§8[§c-§8]" + p.getName());
		Bukkit.broadcastMessage("§6Quedan" + Bukkit.getOnlinePlayers());
	}
}

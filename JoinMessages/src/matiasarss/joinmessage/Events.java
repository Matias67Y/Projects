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
	public void onJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		Bukkit.broadcastMessage("§8[§a+§8]" + player.getName());
		player.sendMessage("§cBienvenido a el Servidor!");
		player.sendMessage("§cDiviertete con tus Amigos!");
		player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 1));
		
	}
	@EventHandler
	public void Ondeparture(PlayerQuitEvent event) {
		Player player = event.getPlayer();
		Bukkit.broadcastMessage("§8[§c-§8]" + player.getName());
		Bukkit.broadcastMessage("§6Quedan" + Bukkit.getOnlinePlayers());
	}
}

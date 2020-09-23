package matiasarss.joinmessage;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Main extends JavaPlugin {

	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED+"---------------------------------------");
		Bukkit.getConsoleSender().sendMessage(ChatColor.WHITE+"El Plugin se Activo | version: 1.0");
		Bukkit.getConsoleSender().sendMessage(ChatColor.WHITE+"Author: MatiasArss");
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED+"---------------------------------------");
	}
	
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED+"---------------------------------------");
		Bukkit.getConsoleSender().sendMessage(ChatColor.WHITE+"El Plugin se Desactivo | version: 1.0");
		Bukkit.getConsoleSender().sendMessage(ChatColor.WHITE+"Bye!");
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED+"---------------------------------------");
	}
	
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		Bukkit.broadcastMessage("§8[§a+§8]" + p.getName());
		p.sendMessage("§cBienvenido a el Servidor!");
		p.sendMessage("§cDiviertete con tus Amigos!");
		p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 1));
		
	}
	
	public void Ondeparture(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		Bukkit.broadcastMessage("§8[§c-§8]" + p.getName());
		Bukkit.broadcastMessage("§6Quedan" + Bukkit.getOnlinePlayers());
	}
}

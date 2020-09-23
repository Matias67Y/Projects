package matiasarss.joinmessage;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public void onEnable() {
		PluginManager pm = this.getServer().getPluginManager();
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED+"---------------------------------------");
		Bukkit.getConsoleSender().sendMessage(ChatColor.WHITE+"El Plugin se Activo | version: 1.0");
		Bukkit.getConsoleSender().sendMessage(ChatColor.WHITE+"Author: MatiasArss");
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED+"---------------------------------------");
		pm.registerEvents(new Events(), this);
	}
	
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED+"---------------------------------------");
		Bukkit.getConsoleSender().sendMessage(ChatColor.WHITE+"El Plugin se Desactivo | version: 1.0");
		Bukkit.getConsoleSender().sendMessage(ChatColor.WHITE+"Bye!");
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED+"---------------------------------------");
	}

}

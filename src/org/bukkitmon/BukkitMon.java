package org.bukkitmon;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.Server;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Priority;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginLoader;
import org.bukkit.plugin.java.JavaPlugin;

public class BukkitMon extends JavaPlugin{

	public static final Logger log = Logger.getLogger("Minecraft");
	private String name = "BukkitMon";
	private String version = "v0.1.0 (Bulbasaur)";
	private tPermissions perms = new tPermissions("BukkitMon" + File.separator + "bukkitmon.perms");
	private final BMPListener playerListener = new BMPListener(this, perms);
	
	public BukkitMon(PluginLoader pluginLoader, Server instance,
			PluginDescriptionFile desc, File folder, File plugin,
			ClassLoader cLoader) {
		super(pluginLoader, instance, desc, folder, plugin, cLoader);
		this.registerEvents();
		this.addCommands();
		this.perms.loadPermissions();
		this.perms.savePermissions();
	}

	public void onDisable() {
		log.info(name + " " + version + " disabled!");
	}

	public void onEnable() {
		log.info(name + " " + version + " enabled!");
	}
	
	public void addCommands()
	{
		perms.addCmd("mobs");
		perms.addCmd("mobtype");
		perms.addCmd("randomamount");
		perms.addCmd("randomtype");
		perms.addCmd("maxamount");
		perms.addCmd("activate");
		perms.addCmd("list");
	}
	
	public void registerEvents()
	{
		getServer().getPluginManager().registerEvent(Event.Type.PLAYER_EGG_THROW, playerListener, Priority.Normal, this);
		getServer().getPluginManager().registerEvent(Event.Type.PLAYER_COMMAND, playerListener, Priority.Normal, this);
	}

}

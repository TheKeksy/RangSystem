package com.github.TheKeksy.RangSystem;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class RangSystem extends JavaPlugin {
	
	public void onEnable() {
		this.getLogger().info("[RangSystem] Plugin enabled");
		this.getCommand("wahl").setPermissionMessage(
				ChatColor.RED + "You dont have the permisson!");
		this.getCommand("wahl").setExecutor(new Wahl(this));
	}
	
	public void onDisable() {
		this.getLogger().info("[RangSystem] Plugin disabled");
	}

}

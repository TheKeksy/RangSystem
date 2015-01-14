package com.github.TheKeksy.RangSystem;

import java.util.HashMap;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Wahl implements CommandExecutor {
	
	private HashMap<Player, String> hm = new HashMap<Player, String>();
	private RangSystem plugin;
	
	public Wahl(RangSystem rangsystem) {
		plugin = rangsystem;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		// TODO Auto-generated method stub
		
		Player p = null;
		
		if (sender instanceof Player) {
			p = (Player) sender;
		}
		
		if (cmd.getName().equalsIgnoreCase("wahl")) {
			hm.put(p, args[0]);
			sender.sendMessage(args[0] + p.getPlayerListName());
			
			return true;
		}
		return false;
	}

}

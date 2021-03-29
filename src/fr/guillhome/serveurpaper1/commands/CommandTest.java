package fr.guillhome.serveurpaper1.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CommandTest implements CommandExecutor {

	@Override
	public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String msg,
			@NotNull String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player)sender;
			
			if(cmd.getName().equalsIgnoreCase("test")) {
				player.sendMessage("bravo tu as réussit le test");
			return true;
			}
			
			
			if(cmd.getName().equalsIgnoreCase("alert")) {
				
				
				if(args.length == 0) {
					player.sendMessage("§4La commande est: /alert <message>");
				
				}
				
				if(args.length >= 1) {
					
					StringBuilder bc = new StringBuilder();
					for(String part : args) {
						bc.append(part + " ");
					}
				
					Bukkit.broadcastMessage("§9[" + "§b" + player.getName() + "§9] " + "§e" + bc.toString());
				
				}
				
				
			return true;
			}
			
		}
		
		return false;
	}

}

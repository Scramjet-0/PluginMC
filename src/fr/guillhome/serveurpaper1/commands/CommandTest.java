package fr.guillhome.serveurpaper1.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class CommandTest implements CommandExecutor {

	@Override
	public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String msg,
			@NotNull String[] args) {
		// TODO Auto-generated method stub
		
		sender.sendMessage("Bravo!!!");
		
		return false;
	}

}

// 11"18
package fr.guillhome.serveurpaper1;

import org.bukkit.plugin.java.JavaPlugin;

import fr.guillhome.serveurpaper1.commands.CommandTest;

public class Main extends JavaPlugin {

@Override
public void onEnable() {
	System.out.println("Hello :)");
	getCommand("test").setExecutor(new CommandTest());
	getCommand("alert").setExecutor(new CommandTest() );
	getServer().getPluginManager().registerEvents(new MonPluginListeners(), this);
}

@Override
	public void onDisable() {
		System.out.println("bye bye...");
	}




}

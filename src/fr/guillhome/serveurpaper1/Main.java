package fr.guillhome.serveurpaper1;

import org.bukkit.plugin.java.JavaPlugin;

import fr.guillhome.serveurpaper1.commands.CommandTest;

public class Main extends JavaPlugin {

@Override
public void onEnable() {
	System.out.println("le plugin s'allume");
	getCommand("test").setExecutor(new CommandTest());


}

@Override
	public void onDisable() {
		System.out.println("le plugin s'eteind");
	}




}

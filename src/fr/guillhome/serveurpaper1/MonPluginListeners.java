package fr.guillhome.serveurpaper1;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MonPluginListeners implements Listener {

	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		
	Player player = event.getPlayer();
	player.getInventory().clear();
	player.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD, 3));
	
	ItemStack customsword = new ItemStack(Material.DIAMOND_AXE, 1);
	ItemMeta customM = customsword.getItemMeta();
	customM.setDisplayName("§bExalibur");
	customM.setLore(Arrays.asList("ligne1" + "ligne2" + "ligne3"));
	customsword.setItemMeta(customM);
	player.getInventory().setItemInOffHand(customsword);
	player.updateInventory();
	}


}

package io.github.vexytal.betanpc.menus;

import org.bukkit.ChatColor;

import io.github.vexytal.betanpc.items.professionmenu.SpawnFishingRod;
import io.github.vexytal.betanpc.items.professionmenu.SpawnPickaxe;
import io.github.vexytal.betanpc.items.utils.BackToMainMenu;
import io.github.vexytal.menuengine.engine.MenuModel;

public class ProfessionMenu extends MenuModel {

	public ProfessionMenu() {
		super(9, ChatColor.GOLD.toString() + ChatColor.BOLD + "Spawn Profession Items");
		getMenu().addItem(SpawnPickaxe.class, 0);
		getMenu().addItem(SpawnFishingRod.class, 1);
		
		getMenu().addItem(BackToMainMenu.class, 8);
	}
	
}

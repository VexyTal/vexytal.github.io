package io.github.vexytal.betanpc.menus;

import org.bukkit.ChatColor;

import io.github.vexytal.betanpc.items.mainmenu.ChangeLevel;
import io.github.vexytal.betanpc.items.mainmenu.ExitMenu;
import io.github.vexytal.betanpc.items.mainmenu.SpawnGems;
import io.github.vexytal.betanpc.items.mainmenu.SpawnItem;
import io.github.vexytal.betanpc.items.mainmenu.SpawnMiscItems;
import io.github.vexytal.betanpc.items.mainmenu.SpawnProfessionItem;
import io.github.vexytal.menuengine.engine.MenuModel;

public class MainMenu extends MenuModel {

	public MainMenu() {
		super(9, ChatColor.GOLD.toString() + ChatColor.BOLD + "Beta Vendor");
		getMenu().addItem(ChangeLevel.class, 0);
		getMenu().addItem(SpawnItem.class, 1);
		getMenu().addItem(SpawnGems.class, 2);
		getMenu().addItem(SpawnMiscItems.class, 3);
		getMenu().addItem(SpawnProfessionItem.class, 4);
		
		getMenu().addItem(ExitMenu.class, 8);
	}
	
}

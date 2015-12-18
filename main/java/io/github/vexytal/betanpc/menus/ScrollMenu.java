package io.github.vexytal.betanpc.menus;

import io.github.vexytal.betanpc.items.scrollmenu.SpawnTierFiveScrolls;
import io.github.vexytal.betanpc.items.scrollmenu.SpawnTierFourScrolls;
import io.github.vexytal.betanpc.items.scrollmenu.SpawnTierOneScrolls;
import io.github.vexytal.betanpc.items.scrollmenu.SpawnTierThreeScrolls;
import io.github.vexytal.betanpc.items.scrollmenu.SpawnTierTwoScrolls;
import io.github.vexytal.betanpc.items.utils.BackToMainMenu;
import io.github.vexytal.menuengine.engine.MenuModel;

import org.bukkit.ChatColor;

public class ScrollMenu extends MenuModel {

	public ScrollMenu() {
		super(9, ChatColor.GOLD.toString() + ChatColor.BOLD + "Spawn Scrolls");
		getMenu().addItem(SpawnTierOneScrolls.class, 0);
		getMenu().addItem(SpawnTierTwoScrolls.class, 1);
		getMenu().addItem(SpawnTierThreeScrolls.class, 2);
		getMenu().addItem(SpawnTierFourScrolls.class, 3);
		getMenu().addItem(SpawnTierFiveScrolls.class, 4);
		
		getMenu().addItem(BackToMainMenu.class, 8);
	}
	
}

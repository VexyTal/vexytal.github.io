package io.github.vexytal.betanpc.menus;

import io.github.vexytal.betanpc.items.arrowmenu.SpawnTierFiveArrow;
import io.github.vexytal.betanpc.items.arrowmenu.SpawnTierFourArrow;
import io.github.vexytal.betanpc.items.arrowmenu.SpawnTierOneArrow;
import io.github.vexytal.betanpc.items.arrowmenu.SpawnTierThreeArrow;
import io.github.vexytal.betanpc.items.arrowmenu.SpawnTierTwoArrow;
import io.github.vexytal.betanpc.items.utils.BackToMainMenu;
import io.github.vexytal.menuengine.engine.MenuModel;

import org.bukkit.ChatColor;

public class ArrowMenu extends MenuModel {

	public ArrowMenu() {
		super(9, ChatColor.GOLD.toString() + ChatColor.BOLD + "Spawn Arrows");
		getMenu().addItem(SpawnTierOneArrow.class, 0);
		getMenu().addItem(SpawnTierTwoArrow.class, 1);
		getMenu().addItem(SpawnTierThreeArrow.class, 2);
		getMenu().addItem(SpawnTierFourArrow.class, 3);
		getMenu().addItem(SpawnTierFiveArrow.class, 4);
		
		getMenu().addItem(BackToMainMenu.class, 8);
	}
	
}

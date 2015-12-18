package io.github.vexytal.betanpc.menus;

import org.bukkit.ChatColor;

import io.github.vexytal.betanpc.items.tiermenu.TierFive;
import io.github.vexytal.betanpc.items.tiermenu.TierFour;
import io.github.vexytal.betanpc.items.tiermenu.TierOne;
import io.github.vexytal.betanpc.items.tiermenu.TierThree;
import io.github.vexytal.betanpc.items.tiermenu.TierTwo;
import io.github.vexytal.betanpc.items.utils.BackToMainMenu;
import io.github.vexytal.menuengine.engine.MenuModel;

public class TierMenu extends MenuModel {

	public TierMenu() {
		super(9, ChatColor.GOLD.toString() + ChatColor.BOLD + "Tier Menu");
		getMenu().addItem(TierOne.class, 0);
		getMenu().addItem(TierTwo.class, 1);
		getMenu().addItem(TierThree.class, 2);
		getMenu().addItem(TierFour.class, 3);
		getMenu().addItem(TierFive.class, 4);
		
		getMenu().addItem(BackToMainMenu.class, 8);
	}
	
}

package io.github.vexytal.betanpc.menus;

import io.github.vexytal.betanpc.items.potionmenu.SpawnTierFivePotion;
import io.github.vexytal.items.potionmenu.SpawnTierFourPotion;
import io.github.vexytal.items.potionmenu.SpawnTierOnePotion;
import io.github.vexytal.items.potionmenu.SpawnTierThreePotion;
import io.github.vexytal.items.potionmenu.SpawnTierTwoPotion;
import io.github.vexytal.items.utils.BackToMainMenu;
import io.github.vexytal.menuengine.engine.MenuModel;

import org.bukkit.ChatColor;

public class PotionMenu extends MenuModel {

	public PotionMenu() {
		super(9, ChatColor.GOLD.toString() + ChatColor.BOLD + "Spawn Potions");
		getMenu().addItem(SpawnTierOnePotion.class, 0);
		getMenu().addItem(SpawnTierTwoPotion.class, 1);
		getMenu().addItem(SpawnTierThreePotion.class, 2);
		getMenu().addItem(SpawnTierFourPotion.class, 3);
		getMenu().addItem(SpawnTierFivePotion.class, 4);
		
		getMenu().addItem(BackToMainMenu.class, 8);
	}
	
}

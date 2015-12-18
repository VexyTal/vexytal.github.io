package io.github.vexytal.betanpc.menus;

import org.bukkit.ChatColor;

import io.github.vexytal.betanpc.items.miscitemmenu.SpawnArrows;
import io.github.vexytal.betanpc.items.miscitemmenu.SpawnFood;
import io.github.vexytal.betanpc.items.miscitemmenu.SpawnOrbsOfAlteration;
import io.github.vexytal.betanpc.items.miscitemmenu.SpawnPotions;
import io.github.vexytal.betanpc.items.miscitemmenu.SpawnScrolls;
import io.github.vexytal.betanpc.items.miscitemmenu.SpawnTeleportBooks;
import io.github.vexytal.betanpc.items.utils.BackToMainMenu;
import io.github.vexytal.menuengine.engine.MenuModel;

public class MiscItemMenu extends MenuModel {

	public MiscItemMenu() {
		super(9, ChatColor.GOLD.toString() + ChatColor.BOLD + "Spawn Misc. Item(s)");
		getMenu().addItem(SpawnOrbsOfAlteration.class, 0);
		getMenu().addItem(SpawnTeleportBooks.class, 1);
		getMenu().addItem(SpawnArrows.class, 2);
		getMenu().addItem(SpawnScrolls.class, 3);
		getMenu().addItem(SpawnFood.class, 4);
		getMenu().addItem(SpawnPotions.class, 5);
		
		getMenu().addItem(BackToMainMenu.class, 8);
	}
	
}

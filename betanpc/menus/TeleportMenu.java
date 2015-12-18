package io.github.vexytal.betanpc.menus;

import org.bukkit.ChatColor;

import io.github.vexytal.betanpc.items.teleportmenu.TeleportToCrestguard;
import io.github.vexytal.betanpc.items.teleportmenu.TeleportToCyrennica;
import io.github.vexytal.betanpc.items.teleportmenu.TeleportToDarkOakTavern;
import io.github.vexytal.betanpc.items.teleportmenu.TeleportToDeadPeaks;
import io.github.vexytal.betanpc.items.teleportmenu.TeleportToGloomyHallows;
import io.github.vexytal.betanpc.items.teleportmenu.TeleportToHarrisonsFields;
import io.github.vexytal.betanpc.items.teleportmenu.TeleportToTripoli;
import io.github.vexytal.betanpc.items.teleportmenu.TeleportToTrollsbane;
import io.github.vexytal.betanpc.items.utils.BackToMainMenu;
import io.github.vexytal.menuengine.engine.MenuModel;

public class TeleportMenu extends MenuModel {

	public TeleportMenu() {
		super(9, ChatColor.GOLD.toString() + ChatColor.BOLD + "Spawn Teleport Books");
		getMenu().addItem(TeleportToCyrennica.class, 0);
		getMenu().addItem(TeleportToHarrisonsFields.class, 1);
		getMenu().addItem(TeleportToDarkOakTavern.class, 2);
		getMenu().addItem(TeleportToTrollsbane.class, 3);
		getMenu().addItem(TeleportToDeadPeaks.class, 4);
		getMenu().addItem(TeleportToGloomyHallows.class, 5);
		getMenu().addItem(TeleportToTripoli.class, 6);
		getMenu().addItem(TeleportToCrestguard.class, 7);
		getMenu().addItem(BackToMainMenu.class, 8);
	}
	
}

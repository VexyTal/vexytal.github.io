package io.github.vexytal.betanpc.items.miscitemmenu;

import java.util.Arrays;

import io.github.vexytal.betanpc.menus.TeleportMenu;
import io.github.vexytal.menuengine.engine.MenuItem;
import io.github.vexytal.menuengine.engine.MenuModel;
import org.bukkit.event.inventory.ClickType;
import io.github.vexytal.menuengine.utils.Builder;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class SpawnTeleportBooks implements MenuItem {

	@Override
	public void registerItem() {
		MenuItem.items.put(this.getClass(), this);
	}

	@Override
	public void execute(Player plr, ClickType click) {
		MenuModel.menus.get(TeleportMenu.class).getMenu().showToPlayer(plr);
	}

	@Override
	public ItemStack getItem() {
		return new Builder(Material.BOOK).setName(ChatColor.DARK_AQUA + "Spawn Teleport Books").setLore(Arrays.asList(ChatColor.GRAY + "Spawn in Teleportation books to any location.")).getItem();
	}

}

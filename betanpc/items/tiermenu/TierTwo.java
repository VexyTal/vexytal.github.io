package io.github.vexytal.betanpc.items.tiermenu;

import java.util.Arrays;

import io.github.vexytal.betanpc.enums.ItemTier;
import io.github.vexytal.betanpc.menus.ItemSpawnMenu;
import io.github.vexytal.betanpc.workers.ItemSpawnWorker;
import io.github.vexytal.menuengine.engine.DynamicMenuModel;
import io.github.vexytal.menuengine.engine.MenuItem;
import org.bukkit.event.inventory.ClickType;
import io.github.vexytal.menuengine.utils.Builder;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class TierTwo implements MenuItem {

	@Override
	public void registerItem() {
		MenuItem.items.put(this.getClass(), this);
	}

	@Override
	public void execute(Player plr, ClickType click) {
		ItemSpawnWorker m = (ItemSpawnWorker) DynamicMenuModel.createMenu(plr, ItemSpawnMenu.class);
		m.tier = ItemTier.T2;
		m.showToPlayer(plr);
	}

	@Override
	public ItemStack getItem() {
		return new Builder(Material.CHAINMAIL_CHESTPLATE).setName(ChatColor.GREEN + "Tier Two").setLore(Arrays.asList(ChatColor.GRAY + "Spawn " + ChatColor.GREEN.toString() + ChatColor.BOLD + "Tier Two " + ChatColor.GRAY + " Armor and Weapons")).getItem();
	}

}
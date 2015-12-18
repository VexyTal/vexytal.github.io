package io.github.vexytal.betanpc.items.tiermenu;

import java.util.Arrays;

import io.github.vexytal.betanpc.enums.ItemTier;
import io.github.vexytal.betanpc.menus.ItemSpawnMenu;s
import io.github.vexytal.betanpc.workers.ItemSpawnWorker;
import io.github.vexytal.menuengine.engine.DynamicMenuModel;
import io.github.vexytal.menuengine.engine.MenuItem;
import org.bukkit.event.inventory.ClickType;
import io.github.vexytal.menuengine.utils.Builder;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class TierFive implements MenuItem {

	@Override
	public void registerItem() {
		MenuItem.items.put(this.getClass(), this);
	}

	@Override
	public void execute(Player plr, ClickType click) {
		ItemSpawnWorker m = (ItemSpawnWorker) DynamicMenuModel.createMenu(plr, ItemSpawnMenu.class);
		m.tier = ItemTier.T5;
		m.showToPlayer(plr);
	}

	@Override
	public ItemStack getItem() {
		return new Builder(Material.GOLD_CHESTPLATE).setName(ChatColor.YELLOW + "Tier Five").setLore(Arrays.asList(ChatColor.GRAY + "Spawn " + ChatColor.YELLOW.toString() + ChatColor.BOLD + "Tier Five " + ChatColor.GRAY + " Armor and Weapons")).getItem();
	}

}
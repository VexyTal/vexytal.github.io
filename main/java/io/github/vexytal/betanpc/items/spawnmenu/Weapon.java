package io.github.vexytal.betanpc.items.spawnmenu;

import java.util.Arrays;

import io.github.vexytal.betanpc.enums.ItemTier;
import io.github.vexytal.betanpc.enums.ItemType;
import io.github.vexytal.betanpc.enums.SpawnStage;
import io.github.vexytal.betanpc.workers.ItemSpawnWorker;
import io.github.vexytal.menuengine.engine.BonusItem;
import io.github.vexytal.menuengine.engine.DynamicMenuModel;
import io.github.vexytal.menuengine.engine.MenuItem;
import org.bukkit.event.inventory.ClickType;
import io.github.vexytal.menuengine.utils.Builder;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Weapon implements MenuItem, BonusItem<ItemTier> {

	private ItemTier tier;
	
	@Override
	public void setBonusData(ItemTier t) {
		tier = t;
	}

	@Override
	public void registerItem() {
		MenuItem.items.put(this.getClass(), this);
	}

	@Override
	public void execute(Player plr, ClickType click) {
		((ItemSpawnWorker) DynamicMenuModel.getMenu(plr)).stage = SpawnStage.WEAPON_CHOICE;
		DynamicMenuModel.getMenu(plr).showToPlayer(plr);
	}

	@Override
	public ItemStack getItem() {
		return new Builder(tier.getMaterialFromType(ItemType.SWORD)).setName(tier.getTierColor() + "Spawn " + tier.name() + " Weapons").setLore(Arrays.asList(ChatColor.GRAY + "Open " + tier.name() + " Weaponry Menu")).getItem();
	}
	
}

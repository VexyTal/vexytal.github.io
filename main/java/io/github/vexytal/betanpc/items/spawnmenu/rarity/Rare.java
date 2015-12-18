package io.github.vexytal.betanpc.items.spawnmenu.rarity;

import io.github.vexytal.betanpc.enums.SpawnStage;
import io.github.vexytal.betanpc.workers.ItemSpawnWorker;
import io.github.vexytal.itemgenerator.ItemGenerator;
import io.github.vexytal.menuengine.engine.DynamicMenuModel;
import io.github.vexytal.menuengine.engine.MenuItem;
import org.bukkit.event.inventory.ClickType;
import io.github.vexytal.menuengine.utils.Builder;
import io.github.vexytal.enums.ItemRarity;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Rare implements MenuItem {

	@Override
	public void registerItem() {
		MenuItem.items.put(this.getClass(), this);
	}

	@Override
	public void execute(Player plr, ClickType click) {
		ItemSpawnWorker m = (ItemSpawnWorker) DynamicMenuModel.getMenu(plr);
		plr.getInventory().addItem(new ItemGenerator().setTier(m.tier.getDRTier()).setType(m.type.getDRType()).setRarity(ItemRarity.RARE).generateItem().getItem());
		m.stage = SpawnStage.TYPE_CHOICE;
		DynamicMenuModel.getMenu(plr).showToPlayer(plr);
	}

	@Override
	public ItemStack getItem() {
		return new Builder(Material.DIAMOND).setName(ChatColor.AQUA + "Rare").getItem();
	}
	
}
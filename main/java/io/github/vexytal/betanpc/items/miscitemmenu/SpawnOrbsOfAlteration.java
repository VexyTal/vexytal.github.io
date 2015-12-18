package io.github.vexytal.betanpc.items.miscitemmenu;

import java.util.Arrays;

import io.github.vexytal.menuengine.engine.MenuItem;
import org.bukkit.event.inventory.ClickType;
import io.github.vexytal.menuengine.utils.Builder;
import io.github.vexytal.MerchantMechanics.MerchantMechanics;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class SpawnOrbsOfAlteration implements MenuItem {

	@Override
	public void registerItem() {
		MenuItem.items.put(this.getClass(), this);
	}

	@Override
	public void execute(Player plr, ClickType click) {
        ItemStack item = MerchantMechanics.orb_of_alteration.clone();
        item.setAmount(64);
        plr.getInventory().addItem(item);
	}

	@Override
	public ItemStack getItem() {
		return new Builder(Material.MAGMA_CREAM).setName(ChatColor.LIGHT_PURPLE + "Spawn 64x Orbs Of Alteration").setLore(Arrays.asList(ChatColor.GRAY + "Will give you " + ChatColor.BOLD + "64x " + ChatColor.LIGHT_PURPLE + "Orbs Of Alteration")).getItem();
	}

}
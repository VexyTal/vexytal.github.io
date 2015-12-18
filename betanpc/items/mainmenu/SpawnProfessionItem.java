package io.github.vexytal.betanpc.items.mainmenu;

import java.util.Arrays;

import io.github.vexytal.betanpc.menus.ProfessionMenu;
import io.github.vexytal.menuengine.engine.MenuItem;
import io.github.vexytal.menuengine.engine.MenuModel;
import org.bukkit.event.inventory.ClickType;
import io.github.vexytal.menuengine.utils.Builder;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class SpawnProfessionItem implements MenuItem {

	@Override
	public void registerItem() {
		MenuItem.items.put(this.getClass(), this);
	}

	@Override
	public void execute(Player plr, ClickType click) {
		MenuModel.menus.get(ProfessionMenu.class).getMenu().showToPlayer(plr);
	}

	@Override
	public ItemStack getItem() {
		return new Builder(Material.FISHING_ROD).setName(ChatColor.AQUA + "Spawn Profession Item").setLore(Arrays.asList(ChatColor.GRAY + "Spawn Pickaxes/Fishing rods", ChatColor.GRAY + "with a custom level/enchants")).getItem();
	}
	
}

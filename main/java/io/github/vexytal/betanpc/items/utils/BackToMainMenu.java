package io.github.vexytal.betanpc.items.utils;

import io.github.vexytal.betanpc.menus.MainMenu;
import io.github.vexytal.betanpc.menus.TierMenu;
import io.github.vexytal.menuengine.engine.BonusItem;
import io.github.vexytal.menuengine.engine.MenuItem;
import io.github.vexytal.menuengine.engine.MenuModel;
import org.bukkit.event.inventory.ClickType;
import io.github.vexytal.menuengine.utils.Builder;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class BackToMainMenu implements MenuItem, BonusItem<Boolean> {
    
    private boolean isAddWeaponNewNew = false;

	@Override
	public void registerItem() {
		MenuItem.items.put(this.getClass(), this);
	}

	@Override
	public void execute(Player plr, ClickType click) {
	    if (!isAddWeaponNewNew) {
	        MenuModel.menus.get(MainMenu.class).getMenu().showToPlayer(plr);
	    }
	    else {
	        MenuModel.menus.get(TierMenu.class).getMenu().showToPlayer(plr);
	    }
	}

	@Override
	public ItemStack getItem() {
		return new Builder(Material.ARROW).setName(ChatColor.GRAY + "Back to Main Menu").getItem();
	}

    @Override
    public void setBonusData(Boolean isAddWeaponNewNewCommand) {
        isAddWeaponNewNew = isAddWeaponNewNewCommand;
    }
	
}

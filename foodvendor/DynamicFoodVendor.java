package io.github.vexytal.foodvendor;

import io.github.vexytal.menuengine.engine.DynamicMenu;
import io.github.vexytal.menuengine.engine.DynamicMenuModel;

import org.bukkit.entity.Player;

public class DynamicFoodVendor extends DynamicMenu {

	public DynamicFoodVendor(int size, DynamicMenuModel parent, Player owner) {
		super(size, parent, owner);
		this.name = "Food Vendor";
	}
	
}
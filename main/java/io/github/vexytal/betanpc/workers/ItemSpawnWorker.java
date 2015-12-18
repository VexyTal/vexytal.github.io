package io.github.vexytal.betanpc.workers;

import io.github.vexytal.betanpc.enums.ItemTier;
import io.github.vexytal.betanpc.enums.ItemType;
import io.github.vexytal.betanpc.enums.SpawnStage;
import io.github.vexytal.menuengine.engine.DynamicMenu;
import io.github.vexytal.menuengine.engine.DynamicMenuModel;

import org.bukkit.entity.Player;

public class ItemSpawnWorker extends DynamicMenu {

	public ItemType type;
	public ItemTier tier = ItemTier.T1;
	public SpawnStage stage = SpawnStage.TYPE_CHOICE;
	
	public ItemSpawnWorker(int size, DynamicMenuModel parent, Player owner) {
		super(size, parent, owner);
	}
	
}

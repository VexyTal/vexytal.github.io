package io.github.vexytal.betanpc.enums;


public enum ItemType {
	
	HELMET, CHESTPLATE, LEGGINGS, BOOTS, SWORD, AXE, STAFF, POLEARM, BOW;
	
	public io.github.vexytal.enums.ItemType getDRType(){
		switch(this){
			case AXE:
				return io.github.vexytal.enums.ItemType.AXE;
			case BOOTS:
				return io.github.vexytal.enums.ItemType.BOOTS;
			case BOW:
				return io.github.vexytal.enums.ItemType.BOW;
			case CHESTPLATE:
				return io.github.vexytal.enums.ItemType.CHESTPLATE;
			case HELMET:
				return io.github.vexytal.enums.ItemType.HELMET;
			case LEGGINGS:
				return io.github.vexytal.enums.ItemType.LEGGINGS;
			case POLEARM:
				return io.github.vexytal.enums.ItemType.POLEARM;
			case STAFF:
				return io.github.vexytal.enums.ItemType.STAFF;
			case SWORD:
				return io.github.vexytal.enums.ItemType.SWORD;
		}
		
		return null;
	}
	
}

package io.github.vexytal.foodvendor;

public class FoodVendor {
	
	public void onEnable(){
		new FoodItem().registerItem();
		new MenuFoodVendor();
	}
	
}

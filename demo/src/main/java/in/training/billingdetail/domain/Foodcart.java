package in.training.billingdetail.domain;

import java.util.List;

public class Foodcart {
	
	String foodacrtId;
	List<Item> foodList;
	
	public Foodcart() {}
	
	public Foodcart(String foodacrtId, List<Item> foodList) {
		super();
		this.foodacrtId = foodacrtId;
		this.foodList = foodList;
	}
	public String getFoodacrtId() {
		return foodacrtId;
	}
	public void setFoodacrtId(String foodacrtId) {
		this.foodacrtId = foodacrtId;
	}
	public List<Item> getFoodList() {
		return foodList;
	}
	public void setFoodList(List<Item> foodList) {
		this.foodList = foodList;
	}
	
	

}

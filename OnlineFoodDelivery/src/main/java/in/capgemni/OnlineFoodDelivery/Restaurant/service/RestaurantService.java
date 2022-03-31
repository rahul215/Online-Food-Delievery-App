package in.capgemni.OnlineFoodDelivery.Restaurant.service;

import java.util.List;

import in.capgemni.OnlineFoodDelivery.Restaurant.domain.FoodMenu;
import in.capgemni.OnlineFoodDelivery.Restaurant.domain.Restaurant;

public interface RestaurantService {
	public void save(Restaurant restaurant);
	public Restaurant update(Restaurant restaurant);
	public List<Restaurant> findAll();
	public Restaurant findOne(Long id);
	public List<FoodMenu>showFoodMenu(Long restaurantId);
}
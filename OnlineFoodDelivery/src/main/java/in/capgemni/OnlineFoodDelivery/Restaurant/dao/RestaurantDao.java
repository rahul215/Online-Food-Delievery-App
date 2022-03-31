package in.capgemni.OnlineFoodDelivery.Restaurant.dao;

import java.util.List;

import in.capgemni.OnlineFoodDelivery.Restaurant.domain.FoodMenu;
import in.capgemni.OnlineFoodDelivery.Restaurant.domain.Restaurant;

public interface RestaurantDao extends GenericDao<Restaurant> {

	public List<FoodMenu>showFoodMenu(Long restaurantId);
}

package in.capgemni.OnlineFoodDelivery.Restaurant.dao;

import java.util.List;

import in.capgemni.OnlineFoodDelivery.Restaurant.domain.FoodMenu;

public interface FoodMenuDao extends GenericDao<FoodMenu>{
	
	public List<FoodMenu >findAllMenuByResturantID(Long resturantId);
	
}

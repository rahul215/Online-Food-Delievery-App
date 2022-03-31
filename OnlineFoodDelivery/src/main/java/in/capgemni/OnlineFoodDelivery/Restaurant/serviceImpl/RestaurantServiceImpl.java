package in.capgemni.OnlineFoodDelivery.Restaurant.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.capgemni.OnlineFoodDelivery.Restaurant.dao.RestaurantDao;
import in.capgemni.OnlineFoodDelivery.Restaurant.domain.FoodMenu;
import in.capgemni.OnlineFoodDelivery.Restaurant.domain.Restaurant;
import in.capgemni.OnlineFoodDelivery.Restaurant.service.RestaurantService;




@Service
@Transactional

public class RestaurantServiceImpl implements RestaurantService{
	@Autowired
	private RestaurantDao restaurantDao;

    public void save(Restaurant restaurant) {  		
    	restaurantDao.save(restaurant);
	}
    
    public Restaurant update(Restaurant restaurant) {  		
		return restaurantDao.update(restaurant);
	}
	
  	
	public List<Restaurant> findAll() {
		return (List<Restaurant>)restaurantDao.findAll();
	}

	public Restaurant findOne(Long id) {
		return restaurantDao.findOne(id);
	}
	
	public List<FoodMenu>showFoodMenu(Long restaurantId){
		
		return restaurantDao.showFoodMenu(restaurantId);
	}
}

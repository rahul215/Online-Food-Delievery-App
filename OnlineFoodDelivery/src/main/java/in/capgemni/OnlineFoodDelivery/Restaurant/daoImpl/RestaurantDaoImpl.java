package in.capgemni.OnlineFoodDelivery.Restaurant.daoImpl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import in.capgemni.OnlineFoodDelivery.Restaurant.dao.RestaurantDao;
import in.capgemni.OnlineFoodDelivery.Restaurant.domain.FoodMenu;
import in.capgemni.OnlineFoodDelivery.Restaurant.domain.Restaurant;

@Repository
public class RestaurantDaoImpl extends GenericDaoImpl<Restaurant> implements RestaurantDao  {

	public RestaurantDaoImpl() {

		super.setDaoType(Restaurant.class);
	}
	@SuppressWarnings("unchecked")
	public List<FoodMenu>showFoodMenu(Long restaurantId){
		
		Query query = entityManager
				.createQuery("select r.foodMenu from Restaurant  r  " + "where food.RESTAURANT_ID =:resturantId");
		return (List<FoodMenu>) query.setParameter("resturantId", restaurantId).getResultList();

	}

	
}

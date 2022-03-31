package in.capgemni.OnlineFoodDelivery.Restaurant.daoImpl;

import java.util.List;

import javax.persistence.Query;

import in.capgemni.OnlineFoodDelivery.Restaurant.dao.FoodMenuDao;
import in.capgemni.OnlineFoodDelivery.Restaurant.domain.FoodMenu;

public class FoodMenuDaoImpl extends GenericDaoImpl<FoodMenu> implements FoodMenuDao{

	public FoodMenuDaoImpl() {
		super.setDaoType(FoodMenu.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FoodMenu> findAllMenuByResturantID(Long resturantId) {

		Query query = entityManager
				.createQuery("select food from FoodMenu  food  " + "where food.resturantId =:resturantId");
		return (List<FoodMenu>) query.setParameter("resturantId", resturantId).getResultList();
	}
	
}

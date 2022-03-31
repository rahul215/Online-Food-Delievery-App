package in.capgemni.OnlineFoodDelivery.Restaurant.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.capgemni.OnlineFoodDelivery.Restaurant.dao.FoodMenuDao;
import in.capgemni.OnlineFoodDelivery.Restaurant.domain.FoodMenu;
import in.capgemni.OnlineFoodDelivery.Restaurant.service.FoodMenuService;

@Service
@Transactional
public class FoodMenuServceImpl implements FoodMenuService{
		@Autowired
		private FoodMenuDao foodMenuDao;
		@Override
		public void save(FoodMenu foodMenu) {
			foodMenuDao.save(foodMenu);
		}
		@Override
		public FoodMenu update(FoodMenu foodMenu) {
			return foodMenuDao.update(foodMenu);
		}
		@Override
		public List<FoodMenu> findAll() {
			return (List<FoodMenu>) foodMenuDao.findAll();
		}
		@Override
		public FoodMenu findOne(Long id) {
			return foodMenuDao.findOne(id);
		}
		@Override
		public List<FoodMenu> findAllMenuByResturantID(Long resturantId) {
			return foodMenuDao.findAllMenuByResturantID(resturantId);
		}

	}
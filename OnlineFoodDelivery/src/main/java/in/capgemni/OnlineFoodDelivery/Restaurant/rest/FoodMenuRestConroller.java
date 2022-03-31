package in.capgemni.OnlineFoodDelivery.Restaurant.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.capgemni.OnlineFoodDelivery.Restaurant.domain.FoodMenu;
import in.capgemni.OnlineFoodDelivery.Restaurant.service.FoodMenuService;

@RestController
@RequestMapping("/api")
public class FoodMenuRestConroller {

	private FoodMenuService foodMenuService;

	public FoodMenuRestConroller(FoodMenuService therestaurantService) {
		foodMenuService = therestaurantService;
	}

	@GetMapping("/restaurants/foodmenu")
	public List<FoodMenu> findall() {
		return foodMenuService.findAll();
	}

	@GetMapping("/restaurants/foodmenu/{foodmenuId}")
	public  FoodMenu getMenu(@PathVariable int foodmenuId) {
		return foodMenuService.findOne((long) foodmenuId);
	}

	@RequestMapping(value = "/restaurants/foodmenu", method = RequestMethod.POST)
	public FoodMenu upload(@RequestBody FoodMenu foodMenu) {
		foodMenu.setId(null);
		foodMenuService.save(foodMenu);
		return foodMenu;
	}
}

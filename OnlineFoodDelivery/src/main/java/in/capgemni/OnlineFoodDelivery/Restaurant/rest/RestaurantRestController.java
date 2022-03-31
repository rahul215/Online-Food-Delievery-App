package in.capgemni.OnlineFoodDelivery.Restaurant.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.capgemni.OnlineFoodDelivery.Restaurant.domain.FoodMenu;
import in.capgemni.OnlineFoodDelivery.Restaurant.domain.Restaurant;
import in.capgemni.OnlineFoodDelivery.Restaurant.service.RestaurantService;

@RestController
@RequestMapping("/api")
public class RestaurantRestController {

private RestaurantService restaurantService;
	
	@Autowired
	public RestaurantRestController(RestaurantService therestaurantService) {
		restaurantService = therestaurantService;
	}

	@GetMapping("/restaurants")
	public List<Restaurant> findall() {
		return restaurantService.findAll();
	}

	@GetMapping("/restaurants/{restaurantId}")
	public Restaurant getResturant(@PathVariable int restaurantId) {
		return restaurantService.findOne((long) restaurantId);
	}

	@RequestMapping(value = "/restaurant/{restaurantId}/menu")
    public List<FoodMenu> showMenuByRestaurantId(@PathVariable int restaurantId) {
        return restaurantService.showFoodMenu((long)restaurantId);
    }

	@RequestMapping(value = "/restaurants", method = RequestMethod.POST)
	public Restaurant upload(@RequestBody Restaurant restaurant) {
		restaurant.setId(null);
		restaurantService.save(restaurant);
		return restaurant;
	}
}

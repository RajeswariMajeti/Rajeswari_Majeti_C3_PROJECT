import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    public static List<Restaurant> restaurants = new ArrayList<>();

    public Restaurant findRestaurantByName(String restaurantName) throws restaurantNotFoundException {
            //DELETE ABOVE STATEMENT AND WRITE CODE HERE
        Restaurant foundRestaurant = null;
        for(Restaurant restaurant : getRestaurants()) {
            if(restaurant.getName().equals(restaurantName)) {
                foundRestaurant =  restaurant;
            }
        }
        if(foundRestaurant == null) {
            throw new restaurantNotFoundException(restaurantName);
        } else {
            return foundRestaurant;
        }

    }


    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}

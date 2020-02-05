package restaurant;

import java.io.File;
import java.io.IOException;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RestaurantManger {
    private RestaurantInfo[] restaurants;

    public RestaurantManger(String fileName) throws  IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        restaurants = objectMapper.readValue(new File(fileName), RestaurantInfo[].class);

    }

    public RestaurantInfo[] getRestaurants() {
        return restaurants;
    }

    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

        RestaurantManger restaurantManger = new RestaurantManger(("D:\\IE\\logme\\src\\main\\resources\\data.json"));
        RestaurantInfo[] restaurans = restaurantManger.getRestaurants();
        System.out.println(restaurans[0]);
//        FlightManager flightManager = new FlightManager("src/main/resources/flights.json");
//        FlightInfo[] flights2 = flightManager.getFlights();
//        System.out.println(flights2[1]);
    }
}

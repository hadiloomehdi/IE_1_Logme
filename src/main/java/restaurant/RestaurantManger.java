package restaurant;

import java.io.File;
import java.io.IOException;

public class RestaurantManger {
    private RestaurantInfo restaurants;

    public RestaurantManger(String fileName) throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        flights = mapper.readValue(new File(fileName), FlightInfo[].class);
    }
}

package exercise;

import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

// BEGIN
@Value
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    public String serialize() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String result = writeValueAsString(this);
        } catch (JsonProcessingException ex) {
                System.out.print("Invalid json");
        }
        return result;
    }

    public static Car unserialize(String json) throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        Car result = mapper.readValue(json, Car.class);
        return result;
    }
    // END
}

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

    public Car unserialize(String json) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Car result = mapper.readValue(json, Car.class);
        } catch (IOException ex1 ||
                JsonParseException ex2 ||
                JsonMappingException ex3) {
            System.out.print("");
        }
        return result;
    }
    // END
}

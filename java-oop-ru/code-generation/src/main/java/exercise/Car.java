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
        String result = writeValueAsString(this);
        return result;
    }

    public Car unserialize(String json) {
        ObjectMapper mapper = new ObjectMapper();
        Car result = mapper.readValue(json, Car.class);
        return result;
    }
    // END
}

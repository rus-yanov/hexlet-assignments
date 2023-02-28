package exercise;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;

class App {
    public static void save(Path path, Car car) {
        try {
            String serializedCar = car.serialize();
            Files.writeString(path, serializedCar,
                    StandardOpenOption.APPEND);
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
    }

    public static Car extract(Path path) {
        String json;
        Car result;
        try {
            json = Files.readString(path);
            result = Car.unserialize(json);
        } catch (IOException ex) {
            System.out.print("Invalid Path");
        }
        return result;
    }
}
// END

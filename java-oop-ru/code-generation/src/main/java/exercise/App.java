package exercise;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
import java.io.IOException;

class App {
    public static void save(Path path, Car car) {
        String serializedCar = car.serialize();
        try {
            Files.writeString(path, serializedCar,
                    StandardOpenOption.APPEND);
        } catch (IOException ex || JsonProcessingException ex1) {
            System.out.print("Invalid Path");
        }
    }

    public static Car extract(Path path) {
        String json;
        try {
            json = Files.readString(path);
        } catch (IOException ex) {
            System.out.print("Invalid Path");
        }
        return Car.unserialize(json);
    }
}
// END

package exercise;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;

class App {
    public static void save(Path path, Car car) throws IOException {
        Files.writeString(path, car.serialize(),
                    StandardOpenOption.APPEND);
    }

    public static Car extract(Path path) throws IOException {
        String json = Files.readString(path);
        Car result = Car.unserialize(json);
        return result;
    }
}
// END

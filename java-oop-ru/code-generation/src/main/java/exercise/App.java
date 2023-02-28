package exercise;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
class App {
    public static void save(Path path, Car car){
        String serializedCar = car.serialize();
        try {
            Files.writeString(path, serializedCar,
                    StandardCharsets.UTF_8);
        }
        catch (IOException ex) {
            System.out.print("Invalid Path");
        }
    }

    public static Car extract(Path path) {
        try {
            String json = Files.readString(path);
        }
        catch (IOException ex) {
            System.out.print("Invalid Path");
        }
        return unserialize(json);
    }
}
// END

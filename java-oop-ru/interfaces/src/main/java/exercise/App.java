package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentList(List<Home> houses, int num) {
        List<String> result = new ArrayList<>();
        if (houses.size() == 0) {
            return result;
        }

        return houses.stream().sorted(Home::compareTo).map(Home::toString).limit(num).collect(Collectors.toList());

    }
}
// END

package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentList(List<Home> list, int num) {
        List<String> result = new ArrayList<>();
        if (appartments.size() == 0) {
            return result;
        }

        return appartments.stream().sorted(Home::compareTo).map(Home::toString).limit(n).collect(Collectors.toList());

    }
}
// END

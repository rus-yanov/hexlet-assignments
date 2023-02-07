package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public ArrayList<String> buildApartmentList(List<Home> list, int num) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            result.add(list.get(i).toString());
        }

        return result;
    }
}
// END

package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// BEGIN
public class App {

    public static void main(String[] args) {
        System.out.println("done");
    }
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();

        for (Map<String, String> book : books) {
            boolean check = false;
            for (Map.Entry<String, String> criteria : where.entrySet()) {
                if (book.containsKey(criteria.getKey())) {
                    if (book.containsValue((criteria.getValue()))) {
                        check = true;
                    } else {
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                result.add(book);
            }
        }
        return result;
    }
}
//END

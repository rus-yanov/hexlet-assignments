package exercise;

import java.util.*;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static void main(String[] args) {

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

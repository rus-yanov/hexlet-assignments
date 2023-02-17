package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> map = storage.toMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            map.put(value, key);
            map.remove(key);
        }
    }
}
// END

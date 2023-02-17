package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> rev = new HashMap<>();
        Map<String, String> map = storage.toMap();
        for (Map.Entry <String, String> entry : map.entrySet()) {
            rev.put(entry.getValue(), entry.getKey())
        }
        storage = new InMemoryKV(rev)
    }
}
// END

package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Set<String> keys = new HashSet<>(storage.toMap().keySet());
        for (String key : keys) {
            storage.set(data.get(key, ""), key);
            storage.unset(key);
        }
    }
}
// END

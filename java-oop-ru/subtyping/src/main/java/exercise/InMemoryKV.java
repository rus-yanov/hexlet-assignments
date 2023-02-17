package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private Map<String, String> map = new HashMap<>();

    public InMemoryKV(Map<String, String> map) {
        this.map = map;
    }

    public void set(String key, String value) {
        if (this.map.containsKey(key)) {
            this.map.replace(key, this.map.get(key), value);
        } else {
            this.map.put(key, value);
        }
    }

    public void unset(String key) {
        this.map.remove(key);
    }

    public String get(String key, String defaultValue) {
        if (this.map.containsKey(key)) {
            return this.map.get(key);
        } else {
            return defaultValue;
        }
    }

    public Map<String, String> toMap()  {
        return this.map;
    }
}
// END

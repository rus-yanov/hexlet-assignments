package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private Map<String, String> map = new HashMap<>();

    public InMemoryKV(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public void set(String key, String value) {
        if (this.map.containsKey(key)) {
            this.map.replace(key, this.map.get(key), value);
        } else {
            this.map.put(key, value);
        }
    }

    @Override
    public void unset(String key) {
        this.map.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return this.map.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap()  {
        return this.map;
    }
}
// END

package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
class Tag {
    private String data;
    private Map<String, String> map;

    Tag(String inputData, Map<String, String> inputMap) {
        this.data = inputData;
        this.map = inputMap;
    }

    public String getData() {
        return data;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public String toString() {
        String init = "<" + data;
        String end = ">";

        return map.entrySet().stream()
                .map(entry -> " " + entry.getKey() + "=\"" + entry.getValue() + "\"")
                .collect(Collectors.joining("", init, end));
    }
}
// END

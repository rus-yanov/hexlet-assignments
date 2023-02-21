package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
import java.util.HashMap;

class Tag {
    private String data;
    private Map<String, String> map = new HashMap<>();

    public Tag(String inputData, Map<String, String> inputMap) {
        this.data = inputData;
        map.putAll(inputMap);
    }

    public String getData() {
        return data;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public String toString() {
        String init = "<" + data + " ";
        String end = ">";

        return map.entrySet().stream()
                .map(entry -> entry.getKey() + "=\"" + entry.getValue())
                .collect(Collectors.joining("\" ", init, end));
    }
}
// END

package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static void main(String[] args) {
        String sentence = "the java is the best programming language java";
        Map<String, Integer> wordsCount = App.getWordCount(sentence);
        String result = App.toString(wordsCount);
        System.out.println(result);
    }
    public static Map<String, Integer> getWordCount(String text) {
        Map<String, Integer> wordsCount = new HashMap<>();
        String[] result = text.split(" ");
        int[] count = new int[result.length];
        int i = -1;
        for (String str : result) {
            i += 1;
            for (String str1 : result) {
                if (str.equals(str1)) {
                    count[i] += 1;
                }
            }
            wordsCount.put(str, count[i]);
        }
        return wordsCount;
    }

    public static String toString(Map<String, Integer> words) {
        StringBuilder result = new StringBuilder("{");
        for (Map.Entry<String, Integer> word : words.entrySet()) {
            result.append("\n  ").append(word.getKey()).append(": ").append(word.getValue());
        }
        result.append("\n}");
        return result.toString();
    }
}
//END

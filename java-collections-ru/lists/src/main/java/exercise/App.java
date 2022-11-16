package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {

    public static void main(String[] args) {
        System.out.println(App.scrabble("rkqodlw", "world"));
        System.out.println(App.scrabble("ajv", "java"));
        System.out.println(App.scrabble("avjafff", "JaVa"));
        System.out.println(App.scrabble("", "hexlet"));
    }

    public static boolean scrabble(String symbols, String word) {
        // list that contains giving symbols
        List<Character> listOfSymbols = new ArrayList<>();
        for (int i = 0; i < symbols.length(); i++) {
            listOfSymbols.add(symbols.toLowerCase().charAt(i));
        }

        // list which contains symbols of giving word
        List<Character> wordList = new ArrayList<>();
        for (int j = 0; j < word.length(); j++) {
            wordList.add(word.toLowerCase().charAt(j));
        }

        return wordList.containsAll(listOfSymbols);
    }
}
//END

package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {

    public static void main(String[] args) {
        System.out.println(App.scrabble("rkqodlw", "woRld"));
        System.out.println(App.scrabble("begsdhhtsexoult", "Hexlet"));
        System.out.println(App.scrabble("thlxertwq", "hexlet"));
        System.out.println(App.scrabble("jvayu", "java"));
        System.out.println(App.scrabble("", "java"));
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

        // wrong way to check if listOfSymbols fully contains wordList
        // return listOfSymbols.containsAll(wordList);
        int s = 0;
        int counter =0;
        while (s < wordList.size()) {
            if (listOfSymbols.contains(wordList.get(s))) {
                listOfSymbols.remove(wordList.get(s));
                counter++;
            }
            s++;
        }

        return counter == wordList.size();
    }
}
//END

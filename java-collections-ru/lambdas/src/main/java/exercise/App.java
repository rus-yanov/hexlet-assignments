package exercise;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

// BEGIN
class App {
    public static void main(String[] args) {
        String[][] image = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };

        System.out.println(Arrays.deepToString(image));

        String[][] enlargedImage = App.enlargeArrayImage(image);
        System.out.println(Arrays.deepToString(enlargedImage));
    }

    public static String[][] enlargeArrayImage(String[][] arrayImage) {
        return Arrays.stream(arrayImage)
                .map(App::apply)
                .map(str -> List.of(str, str))
                .flatMap(List::stream)
                .toArray(String[][]::new);

    }

    private static Object apply(String[] rows) {
        return Arrays.stream(rows)
                .map(s -> List.of(s, s))
                .flatMap(Collection::stream)
                .toArray(String[]::new);
    }
}
// END

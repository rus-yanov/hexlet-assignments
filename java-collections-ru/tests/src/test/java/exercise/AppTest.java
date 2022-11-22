package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List <Integer> expected = new ArrayList<>(Arrays.asList(1, 11, 21, 31));
        List <Integer> elements = new ArrayList<>(Arrays.asList(1, 11, 21, 31, 41, 51));
        int count = 4;
        List <Integer> actual = App.take(elements,count);
        Assertions.assertEquals(expected, actual);

        // END
    }
}

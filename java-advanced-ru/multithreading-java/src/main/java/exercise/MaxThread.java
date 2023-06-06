package exercise;

// BEGIN
import java.lang.Thread;
import java.util.Arrays;

public class MaxThread extends Thread {

    private int[] array;
    private int max;

    public MaxThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int max = Arrays.stream(this.array).max().getAsInt();
        setMax(max);
    }

    public int getMax() {
        return this.max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
// END

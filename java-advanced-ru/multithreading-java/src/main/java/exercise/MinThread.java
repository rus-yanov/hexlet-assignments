package exercise;

// BEGIN
import java.lang.Thread;
import java.util.Arrays;

public class MinThread extends Thread {

    private int[] array;
    private int min;

    public MinThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int min = Arrays.stream(this.array).min().getAsInt();
        setMin(min);
    }

    public int getMin() {
        return this.min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
// END

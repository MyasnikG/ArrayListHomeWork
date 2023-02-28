import java.util.ArrayList;
import java.util.Arrays;

public class Exercise256 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 70, 15, 60, 70, 50, 15, 100, -9, 10, 0, -57));

        int min = numbers.get(0);
        int index = 0;
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
                index = i;
            }
        }

        System.out.println(min + index);
    }
}

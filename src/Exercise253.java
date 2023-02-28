import java.util.ArrayList;
import java.util.Arrays;

public class Exercise253 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 70, 15, 60, 70, 50, 15, 100, -9, 10, 0, -57));

        int max = numbers.get(0);
        int min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }

        System.out.println(max+min);
    }
}

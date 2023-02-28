import java.util.ArrayList;
import java.util.Arrays;

public class Exercise257_260 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 70, -189, 15, 60, 70, 50, 900, 15, 100, -9, 10, -189, 900, 0, -57));

        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }

        int min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }

        System.out.println(numbers.indexOf(max));
        System.out.println(numbers.lastIndexOf(max));
        System.out.println(numbers.indexOf(min));
        System.out.println(numbers.lastIndexOf(min));

    }
}

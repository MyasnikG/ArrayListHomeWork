import java.util.ArrayList;

public class Exercise214 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(-100);
        numbers.add(-55);
        numbers.add(-90);
        numbers.add(21);
        numbers.add(10);
        numbers.add(0);
        numbers.add(-60);
        numbers.add(35);
        numbers.add(-71);
        numbers.add(-1);
        numbers.add(-20);
        numbers.add(57);
        numbers.add(0);

        double sum = 0;
        double count = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)<0){
                sum+=numbers.get(i);
                count++;
            }
        }

        System.out.println(sum/count);
    }
}

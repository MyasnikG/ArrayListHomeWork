import java.util.ArrayList;

public class Exercise233 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(-100);
        numbers.add(-55);
        numbers.add(-90);
        numbers.add(21);
        numbers.add(10);
        numbers.add(1);
        numbers.add(-359);
        numbers.add(30);
        numbers.add(-71);
        numbers.add(-2);
        numbers.add(-20);
        numbers.add(57);
        numbers.add(1);

        int multiply = 1;
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)%2==0){
                multiply*=numbers.get(i);
                sum+=numbers.get(i);
            }

        }

        System.out.println("Multiply is "+ multiply);
        System.out.println("Sum is " + sum);
    }
}

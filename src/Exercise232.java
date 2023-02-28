import java.util.ArrayList;

public class Exercise232 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(-100);
        numbers.add(-55);
        numbers.add(-90);
        numbers.add(21);
        numbers.add(10);
        numbers.add(0);
        numbers.add(-359);
        numbers.add(30);
        numbers.add(-71);
        numbers.add(-2);
        numbers.add(-20);
        numbers.add(57);
        numbers.add(0);

        int count =0;

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)%2==0){
                count++;
            }

        }

        System.out.println(count);
    }
}

import java.util.ArrayList;

public class Exercise217 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(-10);
        numbers.add(-55);
        numbers.add(-9);
        numbers.add(21);
        numbers.add(10);
        numbers.add(0);
        numbers.add(-3);
        numbers.add(30);
        numbers.add(-7);
        numbers.add(-2);
        numbers.add(-20);
        numbers.add(57);
        numbers.add(1);

        double sumPow=1;

        for (int i = 0; i < numbers.size(); i++) {
            if(i%2!=0){
                sumPow*=(numbers.get(i)*numbers.get(i));
            }
        }

        System.out.println(sumPow);
    }
}

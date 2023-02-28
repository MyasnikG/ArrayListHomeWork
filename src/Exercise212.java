import java.util.ArrayList;

public class Exercise212 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(20);
        numbers.add(-100);
        numbers.add(-55);
        numbers.add(-90);
        numbers.add(21);
        numbers.add(10);
        numbers.add(0);
        numbers.add(-359);
        numbers.add(30);

        int sumPow = 0;
        int count = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)>0){
                sumPow+=(numbers.get(i)*numbers.get(i));
                count++;
            }
        }

        System.out.println(Math.sqrt((double)sumPow/count));


    }
}

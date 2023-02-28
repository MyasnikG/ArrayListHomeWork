import java.util.ArrayList;

public class Exercise211 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(560);
        numbers.add(777);
        numbers.add(-100);
        numbers.add(55);
        numbers.add(-90);
        numbers.add(109);
        numbers.add(1000);
        numbers.add(0);
        numbers.add(257);

        int sum = 0;
        int count = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)>0){
                sum+=numbers.get(i);
                count++;
            }
        }

        System.out.println((double)sum/count);


    }



}

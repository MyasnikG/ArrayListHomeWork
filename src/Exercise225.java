public class Exercise225 {

    public static void main(String[] args) {

        int [] array = {-5,9,70,-1,2,-2,3,117,25,-75,50,-599,-51,29,86,-88};
        int t = 99;
        int multiply=1;



        for (int i = 0; i < array.length; i++) {
            if(array[i]>0 && array[i]<t){
               multiply*=array[i];
            } else if(array[i]<0){
                if(-(array[i])<t){
                    multiply*=-(array[i]);
                }
            }
        }
        System.out.println(multiply);


    }
}

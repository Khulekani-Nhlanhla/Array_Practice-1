import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {10,9,8,7,6,5,4,3,2,1};
        int counter = 0;
        System.out.println("Before");
        System.out.println(Arrays.toString(numbers));

        for (int j = 1; j < numbers.length ;j++){
            counter++;
            for (int i = 0; i < numbers.length - j;i++){
                counter++;
                if(numbers[i]>numbers[i + 1]){
                    int greater2 = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = greater2;
                    counter++;
                }
            }


        }System.out.println("After: ");
        System.out.println(Arrays.toString(numbers));
        System.out.println("The number of actions is "+counter);
    }
}

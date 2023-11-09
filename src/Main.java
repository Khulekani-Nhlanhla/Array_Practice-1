import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {10,9,8,7,6,5,4,3,2,1};
        int counter = 0;
        System.out.println("Before");
        System.out.println(Arrays.toString(numbers));

        for (int j = 0; j < numbers.length - 1 ;j++){
            counter++;
            if (numbers[j]> numbers[j + 1]){
                int greater = numbers[j];
                numbers[j] = numbers[j + 1];
                numbers[j + 1] = greater;
                counter++;

            }
            for (int i = 0; i < numbers.length - 1;i++){

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

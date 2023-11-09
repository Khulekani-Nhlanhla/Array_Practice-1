import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {10,9,8,7,6,5,4,3,2,1};
        int count;
        System.out.println("Before");
        System.out.println(Arrays.toString(numbers));

        for (int j = 0; j < numbers.length - 1 ;j++){
            if (numbers[j]> numbers[j + 1]){
                int greater = numbers[j];
                numbers[j] = numbers[j + 1];
                numbers[j + 1] = greater;

            }

        }System.out.println("After: ");
        System.out.println(Arrays.toString(numbers));
    }
}

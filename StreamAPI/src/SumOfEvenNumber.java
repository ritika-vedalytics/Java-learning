import java.util.Arrays;

public class SumOfEvenNumber
{
    public static void main(String[] args)
    {
        // Imperative approach
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 2 == 0)
            {
                sum = sum + array[i];
            }
        }

        System.out.println("Sum using imperative approach: " + sum);

        // Stream approach
        int[] array2 = {1, 2, 3, 4, 5};
        int sum2 = Arrays.stream(array2)
                .filter(n -> n % 2 == 0)
                .sum(); // Use .sum() to get the sum of even numbers

        System.out.println("Sum using stream approach: " + sum2);
    }
}

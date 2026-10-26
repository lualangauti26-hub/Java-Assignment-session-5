/* Swap the first and last remaining elements. temp prevents losing a value.
 * This reverses the array in place using O(n) time and O(1) extra space. */
import java.util.Arrays;

public class problem8Level2 {
    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10, 12 };

        int left = 0;
        int right = numbers.length - 1;

        System.out.println("\nOriginal: " + Arrays.toString(numbers));

        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            left++;
            right--;
        }
        
        System.out.println("\nReversed: " + Arrays.toString(numbers));

        System.out.println();
    }
}

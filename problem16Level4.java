public class problem16Level4 {
    public static void main(String[] args) {

        int[] numbers = new int[10000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int target = 75;

        int linearIndex = -1;
        int linearChecks = 0;

        for (int i = 0; i < numbers.length; i++) {
            linearChecks++;

            if (numbers[i] == target) {
                linearIndex = i;
                break;
            }
        }

        int left = 0;
        int right = numbers.length - 1;
        int binaryIndex = -1;
        int binaryChecks = 0;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            binaryChecks++;

            if (numbers[middle] == target) {
                binaryIndex = middle;
                break;
            } else if (numbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        System.out.println("\nLinear search index: " + linearIndex);
        System.out.println("\nLinear search checks: " + linearChecks);
        System.out.println("\nBinary search index: " + binaryIndex);
        System.out.println("\nBinary search checks: " + binaryChecks + "\n");
    }
}

/*
 * Q1. Linear search checks each element until the target is found
 * or the array ends. Binary search checks the middle element
 * of a sorted array and repeatedly halves the search range.
 * 
 * Q2. Worst-case time complexities:
 * Linear search: O(n).
 * Binary search: O(log n).
 * 
 * Q3. Linear search requires at most 10,000 checks
 * for an array containing 10,000 elements.
 * 
 * Q4. Binary search requires sorted data to determine which half
 * can be discarded. Unsorted data could cause it to miss the target.
 * 
 * Q5. Linear search is reasonable for small arrays, unsorted data,
 * or a single search where sorting would require extra work.
 */

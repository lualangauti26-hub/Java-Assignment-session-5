public class problem14Level4 {
    public static void main(String[] args) {
        int[] scores = { 80, 70, 90, 60 };
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        double average = (double) total / scores.length;
        System.out.println("\n" + average + "\n");

    }
}

/*
 * Question 1
 * No. The loop accesses scores[4], which does not exist, causing an
 * ArrayIndexOutOfBoundsException.
 * 
 * Question 2
 * There are two problems; i <= scores.length goes beyond the array bounds, and
 * integer division discards any decimal part.
 * 
 * Question 3: The corrected code above prints 75.0.
 * 
 * Question 4
 * Using double in division preserves the decimal values.
 * 
 * Question 5
 * No. Changing total to double fixes integer division, but the loop condition
 * must still change to i < scores.length.
 */

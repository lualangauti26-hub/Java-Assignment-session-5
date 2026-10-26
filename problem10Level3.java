/* Selection sort orders a copy from highest to lowest using arrays and loops.
 * Competition rank is 1 plus the number of students with higher scores.
 * Ties share a rank, and subsequent ranks skip positions. */
public class problem10Level3 {
    public static void main(String[] args) {
        int[] scores = { 78, 90, 65, 90, 85, 72, 95, 85 };

        int[] sorted = new int[scores.length];

        for (int i = 0; i < scores.length; i++) {
            sorted[i] = scores[i];
        }

        for (int i = 0; i < sorted.length - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[j] > sorted[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = sorted[i];
            sorted[i] = sorted[maxIndex];
            sorted[maxIndex] = temp;
        }

        System.out.print("\nSorted scores: ");
        for (int score : sorted) {
            System.out.print(score + " ");
        }
        System.out.println();

        System.out.print("\nTop three distinct scores: ");
        int distinctCount = 0;

        for (int i = 0; i < sorted.length && distinctCount < 3; i++) {
            if (i == 0 || sorted[i] != sorted[i - 1]) {
                System.out.print(sorted[i] + " ");
                distinctCount++;
            }
        }
        System.out.println();

        for (int i = 0; i < scores.length; i++) {
            int rank = 1;

            for (int j = 0; j < scores.length; j++) {
                if (scores[j] > scores[i]) {
                    rank++;
                }
            }

            System.out.println(
                    "\nStudent " + (i + 1)
                            + ": score = " + scores[i]
                            + ", rank = " + rank);
        }
        System.out.println();
    }

}

/* Use floating-point division to preserve decimals in the average. */
public class problem5Level2 {
    public static void main(String[] args) {
        int[] scores = { 75, 80, 65, 90, 55, 85, 70, 95 };
        int total = 0;
        int passed = 0;

        for (int score : scores) {
            total += score;

            if (score >= 70) {
                passed++;
            }
        }

        double average = (double) total / scores.length;
        double passPercentage = (double) passed / scores.length * 100.0  ;

        System.out.println("\nAverage: " + average + "\n");

        System.out.print("Scores above average: ");
        for (int score : scores) {
            if (score > average) {
                System.out.print(score + " ");
            }
        }

        System.out.println();
        System.out.printf("\nStudents who passed: %d\n", passed);
        System.out.printf("\nPass percentage: %.1f" + "%%\n\n", passPercentage);
    }
}

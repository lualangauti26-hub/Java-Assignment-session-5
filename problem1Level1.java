/* Array indexes start at 0; student positions start at 1. */
public class problem1Level1 {
    public static void main(String[] args) {
        int[] scores = { 80, 75, 90, 65, 85 };

        for (int i = 0; i < scores.length; i++) {
            System.out.println("\nStudent " + (i + 1) + ": " + scores[i]);
        }
        System.out.println();
        System.out.println("Score at index 2: " + scores[2] + "\n");
    }
}

// An index starts at 0, while the student's position starts at 1. Therefore,
// Index 2 = Student 3

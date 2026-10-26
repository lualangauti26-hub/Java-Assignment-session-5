/* Preserve first-occurrence order and print each duplicated ID once.
 * No Set or Java collections are used. */
public class problem11Level3 {
    public static void main(String[] args) {
        int[] ids = { 101, 102, 101, 103, 102, 104, 105, 103 };

        System.out.println();

        System.out.print("Duplicated IDs: ");

        for (int i = 0; i < ids.length; i++) {
            boolean appearedEarlier = false;

            for (int j = 0; j < i; j++) {
                if (ids[j] == ids[i]) {
                    appearedEarlier = true;
                    break;
                }
            }
            if (appearedEarlier) {
                continue;
            }
            for (int j = i + 1; j < ids.length; j++) {
                if (ids[j] == ids[i]) {
                    System.out.print(ids[i] + " ");
                    break;
                }
            }
        }

        System.out.println();

        int[] buffer = new int[ids.length];
        int count = 0;

        for (int id : ids) {
            boolean found = false;

            for (int j = 0; j < count; j++) {
                if (buffer[j] == id) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                buffer[count] = id;
                count++;
            }
        }
        int[] unique = new int[count];
        System.out.println();

        for (int i = 0; i < count; i++) {
            unique[i] = buffer[i];
        }
        System.out.print("Unique IDs: ");
        for (int id : unique) {
            System.out.print(id + " ");
        }
        System.out.println("\n");

        System.out.println("Unique participants: " + count);
        System.out.println();

        // Additional challenge: compact unique IDs into the original array.
        // Java arrays cannot shrink; only the first uniqueCount entries are used.
        int uniqueCount = 0;
        for (int i = 0; i < ids.length; i++) {
            boolean found = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (ids[j] == ids[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                ids[uniqueCount] = ids[i];
                uniqueCount++;
            }
        }
        System.out.print("In-place unique IDs: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(ids[i] + " ");
        }
        System.out.println("\nUnique participants: " + uniqueCount);
    }
}

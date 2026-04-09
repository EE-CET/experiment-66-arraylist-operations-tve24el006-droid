import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of items
        int n = scanner.nextInt();

        // Create ArrayList
        ArrayList<String> items = new ArrayList<>();

        // Read items
        for (int i = 0; i < n; i++) {
            items.add(scanner.next());
        }

        // Read search item
        String searchItem = scanner.next();

        // Sort the list
        Collections.sort(items);

        // Print sorted list
        System.out.println("Sorted Items: " + items);

        // Search for item
        if (items.contains(searchItem)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        scanner.close();
    }
}
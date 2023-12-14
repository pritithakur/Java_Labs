import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class TreeMaps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Integer> nMap = new TreeMap<>();

        // Add name-age pairs to the TreeMap
        nMap.put("Alice", 25);
        nMap.put("Peter", 30);
        nMap.put("Harry", 35);

        System.out.print("Enter an age to search: ");
        int search = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        boolean found = false;
        for (Map.Entry<String, Integer> entry : nMap.entrySet()) {
            if (entry.getValue() == search) {
                System.out.println("Name with age " + search + ": " + entry.getKey());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No name found with the entered age.");
        }

        scanner.close();
    }
}

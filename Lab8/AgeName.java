import java.util.Scanner;
import java.util.TreeMap;

public class AgeName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Integer> keypair = new TreeMap<>();

        // Add name-age pairs to the TreeMap
        keypair.put("Alice", 25);
        keypair.put("Olpi", 30);
        keypair.put("Maere", 35);
        keypair.put("Harry", 40);

        System.out.print("Enter a name to search: ");
        String search = scanner.nextLine();

        if (keypair.containsKey(search)) {
            int age = keypair.get(search);
            System.out.println("Age of " + search + ": " + age);
        } else {
            System.out.println("Name not found in the TreeMap.");
        }

        scanner.close();
    }
}

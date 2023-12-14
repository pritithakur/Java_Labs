import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneDirectory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phoneDirectory = new HashMap<>();

        while (true) {
            System.out.println("1. Find Number");
            System.out.println("2. Add Number");
            System.out.println("3. Exit");
            System.out.print("Choose An Option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String nameToFind = scanner.nextLine();
                    String phoneNumber = phoneDirectory.get(nameToFind);
                    
                    if (phoneNumber != null) {
                        System.out.println(nameToFind + "'s Phone Number: " + phoneNumber);
                    } else {
                        System.out.println(nameToFind + " not found in the phone book.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Name: ");
                    String nameToAdd = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phoneNumberToAdd = scanner.nextLine();
                    phoneDirectory.put(nameToAdd, phoneNumberToAdd);
                    System.out.println("Successfully Added " + nameToAdd + " To The Phone Book.");
                    break;

                case 3:
                    System.out.println("Exiting the Phone Directory.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please choose a valid option (1, 2, or 3).");
            }
        }
    }
}

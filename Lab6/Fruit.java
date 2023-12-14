import java.util.HashSet;

public class Fruit {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> str = new HashSet<>();

        // Add elements to the HashSet
        str.add("banana");
        str.add("date");
        str.add("apple");

        // Append the specified element to the end
        String newStr = "cherry";
        str.add(newStr);

        // Display the updated HashSet
        System.out.println("Updated HashSet: " + str);
    }
}

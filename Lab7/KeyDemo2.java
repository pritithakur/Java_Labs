import java.util.HashMap;

public class KeyDemo2 {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, String> hset = new HashMap<>();

        // Check if the HashMap is empty
        boolean isEmpty = hset.isEmpty();
        System.out.println("Is the HashMap empty? : " + isEmpty);

        // Add some key-value mappings to the HashMap
        hset.put("Red", "Apple");
        hset.put("Yellow", "Banana");
        hset.put("Green", "Grapes");

        // Check again if the HashMap is empty
        isEmpty = hset.isEmpty();
        System.out.println("Is the HashMap empty? : " + isEmpty);

        // Clear the HashMap
        hset.clear();

        // Check if the HashMap is empty after clearing
        isEmpty = hset.isEmpty();
        System.out.println("Is the HashMap empty after clearing? : " + isEmpty);
    }
}

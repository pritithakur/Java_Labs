import java.util.HashMap;

public class KeyDemo {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> hset = new HashMap<>();

        // Associate values with keys
        hset.put("One", 1);
        hset.put("Two", 2);
        hset.put("Three", 3);

        // Display the HashMap
        System.out.println("HashMap: " + hset);
    }
}

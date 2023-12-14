import java.util.HashMap;
import java.util.Map;

public class Cricketer {
    public static void main(String[] args) {
        // Create a Map to store cricketer names and their scores
        Map<String, Integer> score = new HashMap<>();

        // Add cricketer names and scores to the Map
        score.put("Harman Singh", 75);
        score.put("Rohit Sharma", 89);
        score.put("Ram", 52);
        score.put("Dhawan", 45);

        // Batsman name to search for
        String searchName = "Rohit Sharma";

        // Check if the Map contains the batsman's name
        if (score.containsKey(searchName)) {
            int scores = score.get(searchName);
            System.out.println(searchName + "'s Score: " + scores);
        } else {
            System.out.println(searchName + " not found in the records.");
        }
    }
}

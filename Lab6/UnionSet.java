import java.util.HashSet;
import java.util.Set;

public class UnionSet {
    public static void main(String[] args) {
        // Set1 elements
        Set<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("cherry");

        // Set2 elements
        Set<String> set2 = new HashSet<>();
        set2.add("cherry");
        set2.add("date");
        set2.add("fig");

        // Copy of set1 & set2 in unionSet
        Set<String> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        System.out.println("Union of sets: " + unionSet);

        // Check if unionSet is a subset of set1 or not
        boolean isSubset = set1.containsAll(unionSet);

        if (isSubset) {
            System.out.println("unionSet is a subset of set1.");
        } else {
            System.out.println("unionSet is not a subset of set1.");
        }
    }
}

package activities;
import java.util.HashSet;


public class Activity10 {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hs = new HashSet<>();

        // Add 6 elements to the HashSet
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Cherry");
        hs.add("Date");
        hs.add("Elderberry");
        hs.add("Fig");

        // Print the size of the HashSet
        System.out.println("Size of HashSet: " + hs.size());

        // Remove an element
        hs.remove("Date");
        System.out.println("Removed 'Date' from HashSet.");

        // Try to remove an element not in the set
        boolean removed = hs.remove("Grapes");
        System.out.println("Trying to remove 'Grapes' (not in set): " + (removed ? "Removed" : "Not found"));

        // Check if an item exists in the HashSet
        String itemToCheck = "Cherry";
        boolean exists = hs.contains(itemToCheck);
        System.out.println("Does HashSet contain '" + itemToCheck + "'? " + exists);

        // Print the updated HashSet
        System.out.println("Updated HashSet: " + hs);
    }
}

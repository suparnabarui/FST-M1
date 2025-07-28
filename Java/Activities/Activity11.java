package activities;


import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args) {
        // Create a Map 
        Map<Integer, String> colours = new HashMap<>();

        // Add 5 random colours 
        colours.put(1, "Red");
        colours.put(2, "Blue");
        colours.put(3, "Green");
        colours.put(4, "Yellow");
        colours.put(5, "Purple");

        // Print the Map
        System.out.println("Initial Map: " + colours);

        // Remove one colour 
        colours.remove(4); 
        System.out.println("After removing key 4: " + colours);

        // Check if the colour "Green" exists in the Map
        boolean hasGreen = colours.containsValue("Green");
        System.out.println("Does the Map contain 'Green'? " + hasGreen);

        // Print the size of the Map
        System.out.println("Size of the Map: " + colours.size());
    }
}

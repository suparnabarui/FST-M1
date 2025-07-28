package activities;


import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
       
        ArrayList<String> myList = new ArrayList<>();

       
        myList.add("Alice");
        myList.add("Bob");
        myList.add("Charlie");
        myList.add("Diana");
        myList.add("Ethan");

        // Print all the names using a for loop
        System.out.println("All names in the list:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // Retrieve the 3rd name (index 2) using get()
        String thirdName = myList.get(2);
        System.out.println("\nThe 3rd name in the list is: " + thirdName);

        // Check if a name exists using contains()
        String nameToCheck = "Diana";
        boolean exists = myList.contains(nameToCheck);
        System.out.println("\nDoes the list contain '" + nameToCheck + "'? " + exists);

        // Print the size of the list
        System.out.println("\nNumber of names in the list: " + myList.size());

        // Remove a name and print the size again
        myList.remove("Bob");
        System.out.println("\n'Bob' removed from the list.");
        System.out.println("Number of names in the list after removal: " + myList.size());
    }
}

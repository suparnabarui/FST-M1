package activities;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
    public static void main(String[] args) {
        // Create required objects
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Random indexGen = new Random();

        // Prompt user for input count
        System.out.print("How many numbers do you want to enter? ");
        int count = scan.nextInt();

        // Accept inputs from the user
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = scan.nextInt();
            list.add(num);
        }

        // Generate a random index and print the value at that index
        if (!list.isEmpty()) {
            int randomIndex = indexGen.nextInt(list.size()); // range: 0 to list.size() - 1
            System.out.println("\nRandom index generated: " + randomIndex);
            System.out.println("Value at index " + randomIndex + ": " + list.get(randomIndex));
        } else {
            System.out.println("The list is empty. Nothing to display.");
        }

        // Close the scanner
        scan.close();
    }
}

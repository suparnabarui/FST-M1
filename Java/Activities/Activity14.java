package activities;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 {
    public static void main(String[] args) {
        // Create a File object with the desired file name
        File file = new File("example.txt");

        try {
            // Create the file
            boolean fStatus = file.createNewFile();
            if (fStatus) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Write some text into the file using FileUtils
            String content = "Hello! This is a test file created using File and FileUtils.";
            FileUtils.writeStringToFile(file, content, "UTF-8");

            System.out.println("Text written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred during file operations.");
            e.printStackTrace();
        }
    }
}

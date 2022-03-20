package org.codegym.lessons.lesson_10;

import java.io.FileOutputStream;

/**
 * @author JC Liu
 * @date 2022/3/19$
 */
public class WithResource {

    // Main driver method
    public static void main(String[] args) {
        // Try block to check for exceptions
        try (FileOutputStream fos = new FileOutputStream("demo.txt"))
        {
            // Custom string input
            String text = "Hello World. This is my java program";

            // Converting string to bytes
            byte[] arr = text.getBytes();

            // Text written in the file
            fos.write(arr);
        }
        // Catch block to handle exceptions
        catch (Exception e) {
            // Display message for the occured exception
            System.out.println(e);
        }
        // Display message for successful execution of
        // program
        System.out.println("Resource are closed and message has been written into the demo.txt");
    }
}

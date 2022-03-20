package org.codegym.lessons.lesson_10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author JC Liu
 * @date 2022/3/19$
 */
public class WriteFile {

    public static void main(String[] args) throws IOException {
        // Try block to check for exceptions
        FileOutputStream fos = new FileOutputStream("demo.txt");
        try {
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
        } finally {
            fos.close();
        }

        // Display message for successful execution of
        // program
        System.out.println("Resource are closed and message has been written into the demo.txt");

    }
}

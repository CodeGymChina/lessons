package org.codegym.lessons.lesson_18;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author JC Liu
 * @date 2022/4/16$
 */
public class FileRead {

    public static void main(String[] args) throws IOException {
        File file = new File("hello.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);

        writer.write("this is 123");
        writer.flush();
        writer.close();

        FileReader reader = new FileReader(file);
        char[] arr = new char[50]; //
        reader.read(arr);
        for (char c: arr) {
            System.out.println(c);
        }
        reader.close();
    }
}

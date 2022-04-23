package org.codegym.lessons.lesson_20;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author JC Liu
 * @date 2022/4/23$
 */
public class DeSerializeDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("D:\\tmp.txt");

        ObjectInputStream oin = new ObjectInputStream(fis);

        User user = (User) oin.readObject();

        System.out.println("name="+user.getName());
        System.out.println("age="+user.getAge());
        System.out.println("hobby = "+ user.getHobby());
        oin.close();
        fis.close();
    }
}

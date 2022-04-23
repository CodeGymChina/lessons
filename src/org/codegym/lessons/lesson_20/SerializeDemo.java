package org.codegym.lessons.lesson_20;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author JC Liu
 * @date 2022/4/23$
 */
public class SerializeDemo {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\tmp.txt");
        ObjectOutputStream os = new ObjectOutputStream(fos);

        User user = new User();
        user.setAge(20);
        user.setName("Alice");
        user.setHobby("badminton");
        os.writeObject(user);
        os.flush();
        os.close();
        fos.close();
    }
}

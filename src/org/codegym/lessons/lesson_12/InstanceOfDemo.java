package org.codegym.lessons.lesson_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @author JC Liu
 * @date 2022/3/26$
 */
public class InstanceOfDemo {

    public static void main(String[] args) {
//        Cat cat = new Cat();
//        System.out.println(cat instanceof Animal);
        List<Integer> list = new ArrayList<>();
        if (list instanceof List) {
            System.out.println("ArrayList是List的实例");
        }
        if (list instanceof Vector) {
            System.out.println("Arraylist ");
        } else {
            System.out.println("Arraylist不是Vector的实例");
        }
    }
}

package org.codegym.lessons.lesson_08;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JC Liu
 * @date 2022/3/12$
 */
public class ListDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C3");
        list.add("D4");

        list.remove(2);
        System.out.println(list.get(2));
        int[] arr = new int[5];
        System.out.println(arr[0]);
    }
}

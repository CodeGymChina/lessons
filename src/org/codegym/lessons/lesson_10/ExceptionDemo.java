package org.codegym.lessons.lesson_10;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JC Liu
 * @date 2022/3/19$
 */
public class ExceptionDemo {

    public static void main(String[] args) {
        //ArithmeticException
//        int a = 5;
//        int b = 0;
//        System.out.println(a/b);

        //ArrayIndexOutOfBoundsException
//        int[] arr = new int[5];
//        System.out.println("第四个元素是："+arr[4]);
//        System.out.println(arr[6]);

        // NullPointerException
        ArrayList<Integer> list = null;
        //System.out.println(list.size());
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
        System.out.println(list.size());
        if (list != null ) {
            list.forEach(System.out::println);
        }
    }
}

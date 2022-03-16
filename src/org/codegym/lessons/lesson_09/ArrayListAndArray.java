package org.codegym.lessons.lesson_09;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @desc: ArrayListAndArray
 * @author: zhailihu
 * @date: 15/03/2022 11:30
 */
public class ArrayListAndArray {
    public static void main(String[] args) {
        //Array
        int arr[] = new int[3];

        arr[0] = 20;
        arr[1] = 25;
        arr[2] = 30;

        for ( int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");


        //ArrayList
        ArrayList<Integer> arrInt = new ArrayList<Integer>();
        /**
         * 自动装箱
         */
        arrInt.add(30);
        arrInt.add(35);
        arrInt.add(40);

        Iterator it = arrInt.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }

}

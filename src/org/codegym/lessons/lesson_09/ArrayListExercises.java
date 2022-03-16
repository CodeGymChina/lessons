package org.codegym.lessons.lesson_09;

import java.util.ArrayList;

/**
 * @desc:
 * @author: zhailihu
 * @date: 16/03/2022 09:48
 */
public class ArrayListExercises {
    public static void main(String[] args) {

        ArrayList<Integer> arrList1 = new ArrayList<>();

        // add()
        arrList1.add(10);
        arrList1.add(20);
        arrList1.add(30);
        arrList1.add(40);

        System.out.println("arrList1 的元素 :");
        for (Integer i : arrList1) {
            System.out.println("Value is = " + i);
        }


        // addAll()
        ArrayList<Integer> arrList2 = new ArrayList<>();
        arrList2.add(40);
        arrList2.add(50);
        arrList2.add(60);

        System.out.println("arrList2 的元素:");
        for (Integer i : arrList2) {
            System.out.println("Value = " + i);
        }

        arrList2.addAll(arrList1);

        System.out.println("addAll()方法调用后: ");
        for (Integer i : arrList2) {
            System.out.println("Value = " + i);
        }


        // get()
        System.out.println("拿到索引是2的元素 : " + arrList1.get(2));

        // size()
        System.out.println("arrList1的长度是 : " + arrList1.size());

        // contains()
        System.out.println("arrList1中是否包含45 : " + arrList1.contains(45));
        System.out.println("arrList1中是否包含45 : " + arrList1.contains(40));

        // indexOf()
        System.out.println("arrList1中值为30的下标是: " + arrList1.indexOf(30));

        // clear()
        arrList1.clear();
        System.out.println("clear()方法调用后，输出arrList1元素: " + arrList1);

        // isEmpty()
        System.out.println("arrList1列表是否为空: " + arrList1.isEmpty());


    }
}






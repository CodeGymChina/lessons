package org.codegym.lessons.lesson_11;

import java.util.LinkedList;

/**
 * @desc:
 * @author: zhailihu
 * @date: 16/03/2022 11:00
 *
 */
public class LinkedListExercises {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<Integer>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//
//        for (Integer n : numbers) {
//            System.out.println(n);
//        }

        //作为堆栈
//        System.out.println("弹栈: " + numbers.pop());
//        System.out.println("压栈：");
//        numbers.push(5);
//        for (Integer n : numbers) {
//            System.out.println(n);
//        }


        //作为队列
        System.out.println("入队，排到队尾: " );
        numbers.offer(5);
        numbers.offer(7);
        numbers.offer(8);

        System.out.println("出队，先进先出：" + numbers.poll());
        System.out.println("出队，先进先出：" + numbers.poll());
        System.out.println("出队，先进先出：" + numbers.poll());
//        for (Integer n : numbers) {
//            System.out.println(n);
//        }


    }
}

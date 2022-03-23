package org.codegym.lessons.lesson_11;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @desc: PriorityQueue
 * 优先队列的作用是能保证每次取出的元素都是队列中权值最小的,和入队顺序无关
 * @author: zhailihu
 * @date: 22/03/2022 20:26
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>();
        //入队
        q.offer("张三");
        q.offer("李四");
        q.offer("王五");

        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());

        System.out.println(q.poll()); // null,队列空了
    }
}

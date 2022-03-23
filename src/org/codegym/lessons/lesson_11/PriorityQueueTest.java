package org.codegym.lessons.lesson_11;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @desc: PriorityQueue
 * 优先队列的作用是能保证每次取出的元素都是队列中权值最小的,和入队顺序无关
 *
 * @author: zhailihu
 * @date: 22/03/2022 20:26
 */
public class PriorityQueueTest {
    public static void main(String[] args) {

        //同样需要实现Comparable接口就可以不按照先进先出排序，可以根据特定字段（年龄）排序。
        Person p1 = new Person("张三",18);
        Person p2 = new Person("李四",28);
        Person p3 = new Person("王五",38);

        Queue<Person> q = new PriorityQueue<>();
        //入队
        q.offer(p1);
        q.offer(p2);
        q.offer(p3);

        //出队
        System.out.println(q.poll().getName());
        System.out.println(q.poll().getName());
        System.out.println(q.poll().getName());

        // null,队列空了
        System.out.println(q.poll());
    }
}


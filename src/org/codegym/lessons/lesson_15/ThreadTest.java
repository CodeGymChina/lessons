package org.codegym.lessons.lesson_15;

/**
 * @desc: 线程创建
 * @author: zhailihu
 * @date: 05/04/2022 15:50
 *
 *   几种写法
 *
 *   1.继承 Thread
 *    new myThread().start();
 *   2.实现 RunnableDemo 接口，重写run方法
 *    new Thread(new MyThread()).start();
 *   3.使用 Lambda 表达式
 *    new Thread(() -> {
 *        System.out.println("新线程已被创建！");
 *    }).start();
 *
 *
 */
public class ThreadTest {
    public static void main(String[] args) {
        //主线程
        System.out.println("我在干活！");

        //子线程
        Thread t1 = new Thread(new PrintLog());
        t1.start();

    }



}
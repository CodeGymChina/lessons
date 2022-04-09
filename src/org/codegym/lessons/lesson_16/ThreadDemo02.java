package org.codegym.lessons.lesson_16;

/**
 * @author JC Liu
 * @date 2022/4/9$
 */
public class ThreadDemo02 extends Thread{

    //共享资源
    static int count = 0;

    /**
     * synchronized 修饰实例方法
     */
    public synchronized void increase() throws InterruptedException {
        sleep(1000);
        count++;
        System.out.println(Thread.currentThread().getName() + ": " + count);
    }
    @Override
    public void run() {
        try {
            increase();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo02 test01 = new ThreadDemo02();
        ThreadDemo02 test02 = new ThreadDemo02();
        Thread t1 = new Thread(test01);
        Thread t2 = new Thread(test02);
        t1.setName("threadOne");
        t2.setName("threadTwo");
        t1. start();
        t2. start();
    }
}

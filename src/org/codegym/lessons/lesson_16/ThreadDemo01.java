package org.codegym.lessons.lesson_16;

/**
 * @author JC Liu
 * @date 2022/4/9$
 */
public class ThreadDemo01 extends Thread{

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
        ThreadDemo01 test = new ThreadDemo01();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        Thread t3 = new Thread(test);
        Thread t4 = new Thread(test);
        Thread t5 = new Thread(test);
        Thread t6 = new Thread(test);
        Thread t7 = new Thread(test);
        t1. start();
        t2. start();
        t3. start();
        t4. start();
        t5. start();
        t6. start();
        t7. start();
    }
}

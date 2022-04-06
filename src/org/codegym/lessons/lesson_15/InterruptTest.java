package org.codegym.lessons.lesson_15;

/**
 * @desc: 线程的中断
 *
 * 1. 线程调用interrupt()方法时，只是给线程发送了一个中断信号（中断标识位为true），仅此而已。
 * 2. 在触发Interrupted Exception异常的同时，JVM会把线程的中断标志位清除。
 *
 * @author: zhailihu
 * @date: 05/04/2022 16:44
 */
public class InterruptTest {
    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        clockThread.start();

        Thread.sleep(10000L);
        //尝试手动中断
        clockThread.interrupt();

    }

}

class Clock implements Runnable
{
    public void run()
    {
        Thread current = Thread.currentThread();
        while (!current.isInterrupted())
        {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                System.out.println("线程被中断");
                System.out.println("catch:"+Thread.currentThread().isInterrupted());    //false
//                e.printStackTrace();
                //手动再次中断
                current.interrupt();
                System.out.println("catch:"+Thread.currentThread().isInterrupted());    //true
            }
            System.out.println("Tick");
        }
    }
}





package org.codegym.lessons.lesson_16;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author JC Liu
 * @date 2022/4/9$
 */
public class VolatileTest extends Thread{
    static volatile int increase = 0;
    static AtomicInteger aInteger=new AtomicInteger();
    static void increaseFun() {
        increase++;
        aInteger.incrementAndGet();
    }
    public void run(){
        int i=0;
        while (i < 10000) {
            increaseFun();
            i++;
        }
    }
    public static void main(String[] args) {
        VolatileTest vt = new VolatileTest();
        int THREAD_NUM = 10;
        Thread[] threads = new Thread[THREAD_NUM];
        for (int i = 0; i < THREAD_NUM; i++) {
            threads[i] = new Thread(vt, "Thread" + i);
            threads[i].start();
        }

        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println("volatile value: "+increase);
        System.out.println("AtomicInteger value: "+aInteger);
    }
}

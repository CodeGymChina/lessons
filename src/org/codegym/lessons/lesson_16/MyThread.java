package org.codegym.lessons.lesson_16;

/**
 * @author JC Liu
 * @date 2022/4/9$
 */
public class MyThread extends Thread{

    private String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for(int i = 0; i < 3; i++) {
            System.out.println(threadName + "输出" + i + "，并让出控制权。");
            Thread.yield();
        }
    }
}

package org.codegym.lessons.lesson_22;

/**
 * @author JC Liu
 * @date 2022/4/30$
 */
public class RunnableDemo {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println(" runnable");
        Thread thread = new Thread(runnable);
        thread.start();
    }
}

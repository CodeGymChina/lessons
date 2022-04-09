package org.codegym.lessons.lesson_16;

/**
 * @author JC Liu
 * @date 2022/4/9$
 */
public class SyncDemo {

    public static void main(String[] args) {
        Object o = new Object();

        synchronized (o){
            System.out.println("aaa");
        }
    }
}

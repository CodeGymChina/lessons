package org.codegym.lessons.lesson_22;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author JC Liu
 * @date 2022/4/30$
 */
public class FutureTaskDemo1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> task = new FutureTask<>(() -> "future task works");
        Thread t1 = new Thread(task);
        t1.start();
        String result = task.get();
        System.out.println(result);
    }
}

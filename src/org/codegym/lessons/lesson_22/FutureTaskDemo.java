package org.codegym.lessons.lesson_22;

import java.util.concurrent.*;

/**
 * @author JC Liu
 * @date 2022/4/30$
 */
public class FutureTaskDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        long start = System.currentTimeMillis();

        //input2生成， 需要耗费3秒
        FutureTask<Integer> input2_futureTask = new FutureTask<>(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                Thread.sleep(3000);
                return 5;
            }
        });

        new Thread(input2_futureTask).start();

        //input1生成，需要耗费2秒
        FutureTask<Integer> input1_futureTask = new FutureTask<>(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                Thread.sleep(2000);
                return 3;
            }
        });
        new Thread(input1_futureTask).start();

        Integer integer2 = input2_futureTask.get();
        Integer integer1 = input1_futureTask.get();
        System.out.println(algorithm(integer1, integer2));
        long end = System.currentTimeMillis();
        System.out.println("用时：" + String.valueOf(end - start));
    }

    public static int algorithm(int input, int input2) {
        return input + input2;
    }
}

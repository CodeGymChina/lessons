package org.codegym.lessons.lesson_22;

import java.util.concurrent.*;

/**
 * @author JC Liu
 * @date 2022/4/30$
 */
public class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(2000);
                return "callable";
            }
        };
        ExecutorService service = Executors.newFixedThreadPool(1);
        Future<String> result = service.submit(callable);
        System.out.println(result.get());
        service.shutdown();
    }
}

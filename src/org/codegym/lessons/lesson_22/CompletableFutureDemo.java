package org.codegym.lessons.lesson_22;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author JC Liu
 * @date 2022/4/30$
 */
public class CompletableFutureDemo {

    public static CompletableFuture<String> doOneThing() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "doOneThing";
        });
    }

    public static CompletableFuture<String> doOtherThing(String parameter) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return parameter + " " + "doOtherThing";
        });
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Long start = System.currentTimeMillis();
        // 异步执行版本
        testCompletableFuture();

        Long end = System.currentTimeMillis();
        System.out.println(end- start);
    }

    private static void testCompletableFuture() throws InterruptedException, ExecutionException {
        // 先执行 doOneThing 任务，后执行 doOtherThing 任务
        CompletableFuture<String> resultFuture = doOneThing().thenCompose(CompletableFutureDemo::doOtherThing);

        // 获取任务结果
        String doOneThingResult = resultFuture.get();

        // 获取执行结果
        System.out.println("DoOneThing and DoOtherThing execute finished. result = " + doOneThingResult);
    }
}

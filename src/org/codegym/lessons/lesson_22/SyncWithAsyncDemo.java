package org.codegym.lessons.lesson_22;

/**
 * @author JC Liu
 * @date 2022/4/30$
 */
public class SyncWithAsyncDemo {

    public static void doOneThing() {
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doOneThing ---->>> success");
    }

    public static void doOtherThing() {
        try {
            System.out.println("Main thread: "+Thread.currentThread().getName());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("doOtherThing ---->>> success");
    }

    public synchronized static void main(String[] args) throws InterruptedException {
        Long start = System.currentTimeMillis();

        // 同步调用版本
        // testSynchronize();

        // 异步调用版本
        testAsynchronize();

        Long end = System.currentTimeMillis();
        System.out.println("总耗时："+ (end - start));
    }

    private static void testAsynchronize() throws InterruptedException {
        System.out.println("-------------------- testAsynchronize --------------------");

        // 创建一个线程执行 doOneThing
        Thread doOneThingThread = new Thread(SyncWithAsyncDemo::doOneThing, "doOneThing-Thread");
        doOneThingThread.start();

        doOtherThing();
        // 等待 doOneThing 线程执行完成
        doOneThingThread.join();
    }

    private static void testSynchronize() {
        System.out.println("-------------------- testSynchronize --------------------");

        doOneThing();
        doOtherThing();
    }
}

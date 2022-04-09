package org.codegym.lessons.lesson_16;

/**
 * @author JC Liu
 * @date 2022/4/9$
 */
public class TestDemo09 {
    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = Thread.currentThread();
        Thread joinThread = new Thread(()->{
            for(int i = 0; i < 15; i++){
                try {
                    if(i % 2 == 0){
                        Thread.yield();
                        System.out.println("【线程礼让】线程礼让执行");
                    }
                    Thread.sleep(100);
                    if(i >= 10){
                        mainThread.join();
                    }
                    System.out.println("【" + Thread.currentThread().getName() + "】子线程执行： i = " + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "工作线程");
        joinThread.start();
        for(int i = 0; i < 5; i++){
            Thread.sleep(1000);
            System.out.println("【" + Thread.currentThread().getName() + "】线程执行： i = " + i);
        }
    }
}

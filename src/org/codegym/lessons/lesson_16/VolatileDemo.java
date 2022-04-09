package org.codegym.lessons.lesson_16;


import java.util.concurrent.TimeUnit;

/**
 * @desc: 多线程抢购经典案例
 *
 * 目的是测试在A线程执行了减库存操作后，B线程能不能知道内存变量stock值的改变
 * 本案例运行后，A线程执行减库存操作后，B线程会一直处于死等状态，说明B线程认为stock的值仍是大于0的，并没有及时的知道A线程已经减库存为0的事。
 * 这便是内存可见性的问题场景。
 *
 *
 * @author: zhailihu
 * @date: 09/04/2022 20:11
 */
public class VolatileDemo {
    public static void main(String[] args) {
        final Goods goods = new Goods();

        new Thread("A") {
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //减库存
                //stock == 0
                goods.decrStock();
            }
        }.start();

        new Thread("B") {
            public void run() {
                // 如果库存大于0则一直死等
                // stock != 1
                while (goods.getStock() > 0) { }
                System.out.println(Thread.currentThread().getName() + "\t 现有库存： " + goods.getStock());
            }
        }.start();

        //主线程让出CPU时间片
        Thread.yield();

    }
}

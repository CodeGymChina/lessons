package org.codegym.lessons.lesson_15;

/**
 * @desc: 数据初始化
 * @author: zhailihu
 * @date: 05/04/2022 20:13
 */
public class DataInit implements Runnable {
    @Override
    public void run() {
        //打印当前线程的名称
        System.out.println(Thread.currentThread().getName());

        try {
            //休眠5秒
            Thread.sleep(5000L);
            // TODO: 初始化数据逻辑 ...
            System.out.println("T2线程 正在初始化数据...");
            System.out.println("T2线程 初始化数据完成!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }

}

package org.codegym.lessons.lesson_15;

/**
 * @desc: 日志打印
 * @author: zhailihu
 * @date: 05/04/2022 20:13
 */
public class PrintLog implements Runnable {

    /**
     * run()中编写线程的业务逻辑
     */
    @Override
    public void run() {
        //打印当前线程的名称
        System.out.println(Thread.currentThread().getName());
        //TODO: 日志处理 ...
        System.out.println("正在记录日志...");



    }

}

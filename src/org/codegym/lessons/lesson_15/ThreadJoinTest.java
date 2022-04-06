package org.codegym.lessons.lesson_15;

/**
 * @desc: Join方法的使用
 * @author: zhailihu
 * @date: 05/04/2022 21:20
 */
public class ThreadJoinTest {
    public static void main(String[] args) throws InterruptedException {

        //主线程 T1
        System.out.println("主线程启动！");
        System.out.println("加载配置文件...");
        System.out.println("加载配置文件完成...");

        //子线程 T2
        Thread threadDataInit = new Thread(new DataInit());
        threadDataInit.start();

        //等待T2线程初始化数据
        threadDataInit.join();

        //T2线程初始化数据完成，继续回到主线程T1往下执行
        System.out.println("T1主线程继续执行！");


    }
}

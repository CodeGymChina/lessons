package org.codegym.lessons.lesson_22;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @author JC Liu
 * @date 2022/4/30$
 */
public class FutureTaskTest {

    public static void main(String[] args) {
        //任务集合
        List<FutureTask<Integer>> futureTasks  = new ArrayList<>();
        //创建固定长度的线程池
        ExecutorService pool = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 10; i++) {
            //实例化FutureTask，传入计算任务类
            FutureTask<Integer> futureTask = new FutureTask<>(new ComputeTask(i + ""));
            //添加到任务集合中
            futureTasks.add(futureTask);
            //提交任务到线程池
            pool.submit(futureTask);
        }
        System.out.println("所有【计算任务】提交完毕，主线程开始执行");

        System.out.println("【主线程任务】开始============");
        //主线程睡眠5秒，模拟主线程做某些任务
        try {
            Thread.sleep(5000);
            System.out.println("【主线程任务】开始执行某些任务============");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("【主线程任务】结束============");

        //用于打印任务执行结果
        Integer result = 0;
        for (FutureTask<Integer> task : futureTasks) {
            try {
                //FutureTask的get()方法会自动阻塞，知道得到任务执行结果为止
                result += task.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        //关闭线程池
        pool.shutdown();
        System.out.println("多线程多任务执行结果：" + result);

    }
}

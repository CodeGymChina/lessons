package org.codegym.lessons.lesson_22;

import java.util.concurrent.Callable;

/**
 * @author JC Liu
 * @date 2022/4/30$
 */
public class ComputeTask implements Callable<Integer> {

    private String taskName;


    //任务构造器
    public ComputeTask(String taskName) {
        this.taskName = taskName;
        System.out.println("创建【计算任务】开始，计算任务名称：" + taskName);
    }

    @Override
    public Integer call() {
        Integer result = 0;
        for (int i = 1; i <=50; i++) {
            result = +i;
        }
        System.out.println("【计算任务】"+taskName +"执行完成。");
        return result;
    }
}

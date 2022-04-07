package org.codegym.lessons.lesson_14;

/**
 * @author JC Liu
 * @date 2022/4/2$
 */
public class StaticDemo {



    public StaticDemo() {
        System.out.println("这个类已经被初始化了");
    }

    public StaticDemo(String name) {
        System.out.println(name);
    }

    public void print() {
        System.out.println("我只是一个打印方法");
    }

    public static void main(String[] args) {
        StaticDemo staticDemo = new StaticDemo("123");
        staticDemo.print();
    }

    static {
        System.out.println("这里是static代码块");
    }

    // 存在static代码块，那么类初始化的时候，会优先执行static中的方法/ 初始化static中的值
    // 接着，它才会去调用构造器，然后是执行我们自己定义的方法
}

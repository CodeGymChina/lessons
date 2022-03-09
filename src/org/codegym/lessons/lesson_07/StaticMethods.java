package org.codegym.lessons.lesson_07;

/**
 * @desc: 静态方法
 *
 * @author: zhailihu
 * @date: 09/03/2022 15:48
 */
public class StaticMethods {
    public static int count = 1;    // 定义静态变量count

    public int method1() {
        // 实例方法method1
        count++;    // 访问静态变量count并赋值
        System.out.println("在静态方法 method1()中的 count="+count);    // 打印count
        return count;
    }

    public static int method2() {
        // 静态方法method2
        count += count;    // 访问静态变量count并赋值
        System.out.println("在静态方法 method2()中的 count="+count);    // 打印count
        return count;
    }

    public static void PrintCount() {
        // 静态方法PrintCount
        count += 2;
        System.out.println("在静态方法 PrintCount()中的 count="+count);    // 打印count
    }


    public static void main(String[] args) {
        StaticMethods sft = new StaticMethods();
        // 通过实例对象调用实例方法
//        System.out.println("method1() 方法返回值 intro1="+sft.method1());
//         直接调用静态方法
//        System.out.println("method2() 方法返回值 intro1="+method2());
        // 通过类名调用静态方法，打印 count
        StaticMethods.PrintCount();
    }


}

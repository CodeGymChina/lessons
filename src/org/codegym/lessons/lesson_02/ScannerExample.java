package org.codegym.lessons.lesson_02;

import java.util.Scanner;

/**
 * @author Scott Liu
 * @date 2022/2/19$
 */
public class ScannerExample {

    public static void main(String[] args) {
        //1. 创建Scanner
        Scanner console = new Scanner(System.in); // 数据来源 in = input stream

        System.out.println("请输入你要说的话： ");

        String sentence = console.nextLine(); // 获取下一行内容

        System.out.println("我要说的内容是： "+ sentence);

        // 在编程的时候，我们需要注重语义性，好的代码，往往具备很强的语义性和可读性。
        // 因此，在Scanner中，当我们要处理int类型的输入时，它就为我们提供了nextInt。
        // 如果是处理double，那么相应的我们就可以使用nextDouble。这样清晰的语义，也避免了我们去死记硬背。
        System.out.println("请输入今天的日期：");
        int age = console.nextInt();

        System.out.println("今天是几号：" + age);


    }
}

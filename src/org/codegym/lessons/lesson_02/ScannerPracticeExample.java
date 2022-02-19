package org.codegym.lessons.lesson_02;

import java.util.Scanner;

/**
 * @author Scott Liu
 * @date 2022/2/19$
 */
public class ScannerPracticeExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("计算器");
        System.out.println("请输入你要执行的命令： add | minus | multiple | divide");
        String command = scanner.nextLine(); // 获取我们要执行的操作命令
        command = command.trim(); // 去除空格
        command = command.toLowerCase(); // 统一小写匹配

        if (command.equals("add")) {
            System.out.println("请输入第一个数字：");
            int num1 = scanner.nextInt();
            System.out.println("请输入第二个数字：");
            int num2 = scanner.nextInt();
            System.out.println("计算的结果是：" + (num1 + num2));
        } else if (command.equals("minus")) {
            System.out.println("请输入第一个数字：");
            int num1 = scanner.nextInt();
            System.out.println("请输入第二个数字：");
            int num2 = scanner.nextInt();
            System.out.println("计算的结果是：" + (num1 - num2));
        } else if (command.equals("multiple")) {
            System.out.println("请输入第一个数字：");
            int num1 = scanner.nextInt();
            System.out.println("请输入第二个数字：");
            int num2 = scanner.nextInt();
            System.out.println("计算的结果是：" + (num1 * num2));
        } else if (command.equals("divide")) {
            System.out.println("请输入第一个数字：");
            int num1 = scanner.nextInt();
            System.out.println("请输入第二个数字：");
            int num2 = scanner.nextInt();
            System.out.println("计算的结果是：" + (num1 / num2));
        } else{
            System.out.println("无效输入");
        }
    }
}

package org.codegym.lessons.lesson_05;

import java.util.Scanner;

/**
 * @desc: 条件判断 if/else （简单语句）
 *
 * 条件判断的时候需要理解几个知识点：
 * 1、什么是代码块、缩进
 * 2、多个条件时判断的顺序（程序执行顺序）、边界条件
 * 3、当 if 语句只有一行时，可以省略{}
 * 4、省略{}有的时候也会给自己带来额外麻烦
 * 5、if/else嵌套
 * 6、if/else 注释规范
 *
 * @author: zhailihu
 * @date: 01/03/2022 22:13
 */
public class Condition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        /**
         *    if 单条语句
         *    if 单条语句
         */
        if (score >= 60 ) {
            //如果大于等于60分
            System.out.println("考试及格了");
        }else{
            // ...
//            System.out.println("没及格");
            System.err.println("没及格");

        }

    }
}

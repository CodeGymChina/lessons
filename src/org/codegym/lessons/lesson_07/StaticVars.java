package org.codegym.lessons.lesson_07;

/**
 * @desc: 静态变量小练习
 *
 * 1、直接访问
 * 2、通过类名访问
 * 3、通过对象访问
 *
 * @author: zhailihu
 * @date: 09/03/2022 15:40
 */
public class StaticVars {
    //str1 静态成员变量
    public static String str1 = "Hello";

    public static void main(String[] args) {
        String str2 = "World!";
        // 直接访问str1
        String accessVar1 = str1 + str2;
        System.out.println("第 1 次访问静态变量，结果为："+accessVar1);
        // 通过类名访问str1
        String accessVar2 = StaticVars.str1+str2;
        System.out.println("第 2 次访问静态变量，结果为："+accessVar2);
        // 通过对象svt1访问str1
        StaticVars svt1 = new StaticVars();
        svt1.str1 = svt1.str1+str2;
        String accessVar3 = svt1.str1;
        System.out.println("第3次访向静态变量，结果为："+accessVar3);
        // 通过对象svt2访问str1
        StaticVars svt2 = new StaticVars();
        String accessVar4 = svt2.str1+str2;
        System.out.println("第 4 次访问静态变量，结果为："+accessVar4);
    }
}

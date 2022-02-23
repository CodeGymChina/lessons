package org.codegym.lessons.lesson_03;

/**
 * @desc: 类的模板
 * @author: zhailihu
 * @date: 22/02/2022 22:22
 */

public class Person {
    //属性
    String name = "张三";
    int age = 28;
    int height = 175;
    int weight = 75;

    /**
     * 类的
     * 方法/行为
     */
    void move() {
        System.out.println( name + "在行走" );
    }

    void run() {
        System.out.println( name + "在跑" );
    }

    void haveDinner(){
        System.out.println( name + "在吃饭" );
    }

    void printAge() {
        System.out.println(name + "的年龄是" + age);
    }

    void printName() {
        System.out.println("我的年龄是" + name);
    }


}



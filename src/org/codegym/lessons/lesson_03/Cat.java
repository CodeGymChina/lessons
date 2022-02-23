package org.codegym.lessons.lesson_03;

/**
 * @desc: 猫的实例化
 * @author: zhailihu
 * @date: 22/02/2022 22:39
 */
public class Cat {
    String name;
    int age;

    public static void main(String[] args) {
        Cat barsik = new Cat();
        barsik.age = 3;
        barsik.name = "巴希克";
        System.out.println("猫的名字：" + barsik.name + ",  年龄：" + barsik.age);

    }
}

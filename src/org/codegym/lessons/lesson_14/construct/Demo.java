package org.codegym.lessons.lesson_14.construct;

/**
 * @author JC Liu
 * @date 2022/4/2$
 */
public class Demo {

    public static void main(String[] args) {
        Demo demo = new Demo("name");
    }

    public Demo(){}
    public Demo(String name) {
        System.out.println("name");
    }
}

package org.codegym.lessons.lesson_14.construct;

/**
 * @author JC Liu
 * @date 2022/4/2$
 */
public class A {

    public A() {
        System.out.println("A的无参构造函数");
    }

    public A(String msg) {
        System.out.println("A的有参构造函数: " + msg);
    }

    public void print() {
        System.out.println("A的print方法");
    }
}

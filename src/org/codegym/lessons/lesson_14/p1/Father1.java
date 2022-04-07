package org.codegym.lessons.lesson_14.p1;

/**
 * @author JC Liu
 * @date 2022/4/2$
 */
public class Father1 {

    protected void f() {

        System.out.println("father1的protected方法");
    }

    private void m1(){
        System.out.println("father 1的private方法");
    }
    public static void main(String[] args) {
        Father1 father = new Father1();
        father.f();
        father.m1();
    }
}

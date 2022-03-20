package org.codegym.lessons.lesson_10;

/**
 * @author JC Liu
 * @date 2022/3/19$
 */
public class ThrowMain {

    public static void main(String[] args) {
        System.out.println("hello");
        ThrowsTest throwsTest = new ThrowsTest();
        try {
            throwsTest.throwException();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("结束");
    }
}

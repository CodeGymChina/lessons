package org.codegym.lessons.lesson_04;

/**
 * @author JC Liu
 * @date 2022/2/26$
 */
public class WhileDemo {

    public static void main(String[] args) {
        demoCase(0);
    }

    public static void demoCase(int num) {
        while (num > 0) {
            System.out.println(num);
            num -=10;
        }
    }
}

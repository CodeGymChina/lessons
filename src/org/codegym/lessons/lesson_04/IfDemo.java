package org.codegym.lessons.lesson_04;

/**
 * @author JC Liu
 * @date 2022/2/26$
 */
public class IfDemo {

    public static void isEven(int num) {
        // num % 2
        if (num % 2 == 0) {
            System.out.println("能被2整除");
        } else if (num % 3 == 0){
            System.out.println("能被3整除");
        } else if (num % 5 == 0) {
            System.out.println("能被5整除");
        } else {
            System.out.println("nothing");
        }
    }

    public static void specialCase(int num) {
        // num % 2
        if (num % 2 == 0) {
            System.out.println("能被2整除");
        }

        if (num % 3 == 0){
            System.out.println("能被3整除");
        }

        if (num % 5 == 0) {
            System.out.println("能被5整除");
        }
    }

    public static void main(String[] args) {
        specialCase(30);
    }
}

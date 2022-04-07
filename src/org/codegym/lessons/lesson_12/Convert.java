package org.codegym.lessons.lesson_12;

/**
 * @author JC Liu
 * @date 2022/3/26$
 */
public class Convert {

    public static void main(String[] args) {
        int a = -300; // -1
        System.out.println("a: " + a);
        byte b = (byte) a;
        System.out.println("b: " + b);
        char c = (char) b; // min:0 // 65535
        System.out.println("c: " + c);
        int d = c;
        System.out.println("d: "+ d);
    }
}

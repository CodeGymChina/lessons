package org.codegym.lessons.lesson_04;

/**
 * @author JC Liu
 * @date 2022/2/26$
 */
public class MathOperation {


    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation();
        System.out.println(mathOperation.add(1, 2));
    }


}

package org.codegym.lessons.lesson_06;

/**
 * @author JC Liu
 * @date 2022/3/5$
 */
public class OverLoading {

    public void hello() {
        System.out.println("hello");
    }

    public void hello(String str) {
        System.out.println("hello" + str);
    }

    public int hello(int num) {
        return num;
    }

    private double hello(double num) {
        return num;
    }

    public static void main(String[] args) {
        int num = 1;
        int count = 0;
        StringBuilder builder = new StringBuilder();
        while (num < 10000) {
            if (num % 9 == 0) {
                count++;
                builder.append(num).append(" ");
            }
            if (count == 20) {
                builder.append("\n");
                count = 0;
            }
            num++;
        }
        System.out.println(builder);
    }

    public static void main(int num) {

    }
}

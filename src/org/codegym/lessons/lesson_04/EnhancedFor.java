package org.codegym.lessons.lesson_04;

/**
 * @author JC Liu
 * @date 2022/2/26$
 */
public class EnhancedFor {

    public static void main(String[] args) {
//        String[] hello = {"hello", "world", "!"};
//        forDemo01(hello);
//
//        forDemo02(hello);

        infiniteWhile();



    }

    public static void forDemo01(String[] hello) {
        System.out.println("普通的for");
        for (int i = 0; i < hello.length; i++) {
            System.out.println(hello[i]);
        }
        System.out.println("=========");
    }

    public static void forDemo02(String[] hello) {
        System.out.println("增强for循环");
        for (String word:hello) {
            System.out.println(word);
        }
        System.out.println("========");
    }

    public static void infiniteFor() {
        int num = 10;
        for (;;) {
            if (num > 100) {
                break;
            } else {
                num++;
                System.out.println(num);
            }
        }
    }

    public static void infiniteWhile() {
        while (true) {
            System.out.println(100);
        }
    }
}

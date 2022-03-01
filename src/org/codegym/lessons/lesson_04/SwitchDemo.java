package org.codegym.lessons.lesson_04;

/**
 * @author JC Liu
 * @date 2022/2/26$
 */
public class SwitchDemo {

    public static void main(String[] args) {
        continueDemo(110);
    }

    public static void switchCase(int num) {
        // 条件
        switch (num) {
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            default:
                System.out.println("default");
        }
    }

    public static void breakDemo(int num) {
        // break: 结束循环
        for (int i = 0; i < 50; i++) {
            num+=100;
            System.out.println(num);
            if (num > 1000) {
                System.out.println((i+1)+"次"+"break 循环结束");
                break;
            }
        }
    }

    public static void continueDemo(int num) {
        // break: 结束循环
//        for (int i = 0; i < 50; i++) {
//
//        }
//        System.out.println("final result: " + num);
    }
}

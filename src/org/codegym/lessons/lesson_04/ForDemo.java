package org.codegym.lessons.lesson_04;

/**
 * @author JC Liu
 * @date 2022/2/26$
 */
public class ForDemo {

    public static void forDemo01(int num) {
        // int i; 循环起始条件
        // i < 10 结束条件
        // i++ 自增
        for (int i = 0; i < 10; i++) {
            num += 2;
            System.out.println(num);
        }
    }


    public static void main(String[] args) {
//        forDemo01(10);
        int[] arr = {10, 20, 30, 40, 50, 60};

        System.out.println(arr[0]); // 数组下标0
        System.out.println(arr.length);  //String length() arr[5]

        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.println("第"+i+"个元素是："+arr[i]);
        }
    }
}

package org.codegym.lessons.lesson_01;

/**
 * @desc: 整型变量运算（除法/取余） && 最大值范围
 * @author: zhailihu
 * @date: 27/01/2022 00:52
 */
public class IntegerAssigningValues {
    public static void main(String[] args) {

//        int a = 5 / 2; //2
//        int b = 20 / 3;
        int a = 5 % 2; //取余运算
        int b = 20 % 4;
        System.out.println(b);


//        int a;
//        a = 5;
//        int a = 5;
//        String s = "_Hello World_";
//        System.out.println("s");
//        System.out.println(a);

        // declare variable b;
        /**
         * declare variable
         * int b;
         * aaa
         * bb
         */
//        int b;
//        //20 billion
//        b = 2*1000*1000*1000;
//        System.out.println(b);
//
//        int c;
//        c = -10000000;
//        System.out.println(c);



        /**
         * This code won't compile,
         * because 3,000,000,000 is greater than the maximum possible value for an int,
         * which is 2,147,483,647
         *
         * 30亿超过了整型21亿的上限
         */
//        int d = 2147483646;
    }

}

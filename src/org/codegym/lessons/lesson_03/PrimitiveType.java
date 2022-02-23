package org.codegym.lessons.lesson_03;

/**
 * @desc: Java中八大基本数据类型分类解释
 * @author: zhailihu
 * @date: 22/02/2022 15:31
 */
public class PrimitiveType {

    public static void main(String[] args) {

        /**
         * 整数类型（四种）
         *
         * 整数，可以是正数或负数（例如123或-456），不带小数。
         * 类型分为byte、short、int、long。
         * 各种整型能表示的最大范围如下：
         *
         *  00000000~1111111
         * byte：-128 ~ 127                                          8 Bit
         * short: -32768 ~ 32767                                    16 Bit
         * int: -2147483648 ~ 2147483647                            32 Bit
         * long: -9223372036854775808 ~ 9223372036854775807         64 Bit
         */

        byte b = 127;
        short s = 5002;
        int i1 = 2147483647;
        int i2 = -2147483648;
        long l = 7000000000000000000L; // long型的结尾需要加L

        // talk is cheap , show me the code



        /**
         * 浮点类型（两种）
         *
         * 是指小数，因为小数可以用科学计数法表示，小数点是可以“浮动”的，
         * 如5678.9可以表示成56.789 x 10^2，也可以表示成5.6789 x 10^3，顾名思义，称作浮点数。
         * float类型，需要加上f后缀，养成良好编程习惯。
         */

        float f1 = 3.14f;
        float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
        double d1 = 56.7890;

        /**
         * 布尔类型
         * boolean类型比较简单，只保存true和false两个值
         */

        boolean b1 = true;
        boolean b2 = false;
        boolean isGreater = 7 > 5; // 计算结果为true
        int age = 20;
        boolean isAdult = age >= 80; // 计算结果为false


        /**
         * 字符类型
         * 2 byte
         * char数据类型用于存单个字符。
         * 字符必须用单引号引起来。
         */

        char myGrade = 'c';
        char myScore = 'A';
        System.out.println(myGrade);










    }
}






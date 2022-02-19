package org.codegym.lessons.lesson_02;

import java.io.UnsupportedEncodingException;

/**
 * @desc:　递增和递减
 * @author: Scott Liu
 * @date: 17/02/2022 20:25
 */
public class IncrementAndDecrement {

    public static void main(String[] args) throws UnsupportedEncodingException {
        // 我们在Java中经常会用到递增和递减，但是具体又分两种情况，也就是前递增和后递增。
        // 相应的，也有前递减和后递减
        int a = 100;
        System.out.println("前递增前 a: " + a);
        int b = ++a;
        System.out.println("b: " + b);
        System.out.println("前递增后 a: " + a); //先运算 后赋值
        // 前递增可以理解为，先对值进行加一操作，然后将结果赋值。即先运算，后复制。
        // a + 1 => b

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        int c = 100;
        System.out.println("后递增前 c: " + c);
        int d = c++;
        System.out.println("d: " + d); // d = c, c + 1
        System.out.println("后递增后 c: " + c); // 先赋值 后运算





    }
}

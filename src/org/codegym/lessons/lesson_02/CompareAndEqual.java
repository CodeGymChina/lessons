package org.codegym.lessons.lesson_02;

/**
 * @author Scott Liu
 * @date 2022/2/19$
 */
public class CompareAndEqual {


    public static void main(String[] args) {
        // 对于数字间的比较，我们可以使用==
        int num1 = 10;
        int num2 = 12;
        int num3 = 10;

        System.out.println("num1 和num2 是否相等：" + (num1 == num2));
        System.out.println("num1 和num3 是否相等：" + (num1 == num3));


        // 当int与double类型的值进行比较时，int类型会被转成double，也就是10->10.00
        double num4 = 10.00;
        System.out.println("num1 和num4 是否相等：" + (num1 == num4));
        double num5 = 10.1;
        System.out.println("num1 和num5 是否相等：" + (num1 == num5));


        char c1 = 'a';
        char c2 = 'b';

        System.out.println("c1 和c4 是否相等：" + (c1 == c2));

        // 关于字符串之间比较是否相等，通常会使用equals方法。equals方法不能用来比较基础数据类型是否相等。
        // equals方法是Object类所提供的方法，我们所有的类其实都继承自Object，所以equals的具体逻辑都是由我们自己定义的。
        // 本质上来说，它和==比较的都是值是否相等，只是比较的是引用类型变量存的值，或是对象的地址
        String hello = "hello";
        String world = "world";
        String hello1 = "hello";

        System.out.println("hello 和hello1 是否相等：" + (hello.equals(hello1)));
        System.out.println("hello 和world 是否相等：" + (hello.equals(world)));

        String a = new String("ab"); // a 为一个引用
        String b = new String("ab"); // b为另一个引用,对象的内容一样
        String aa = "ab"; // 放在常量池中
        String bb = "ab"; // 从常量池中查找
        System.out.println(aa == bb);// true
        System.out.println(a == b);// false
        System.out.println(a.equals(b));// true
        System.out.println(42 == 42.0);// true
    }


}

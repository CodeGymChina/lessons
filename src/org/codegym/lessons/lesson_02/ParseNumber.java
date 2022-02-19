package org.codegym.lessons.lesson_02;

/**
 * @author Scott Liu
 * @date 2022/2/19$
 */
public class ParseNumber {

    public static void main(String[] args) {
        // 在有些情况下，我们需要将String对象中的内容转换为数字，那么我们就可以根据数字的类型，来进行转换
        String number = "123";
        int res = Integer.parseInt(number);

        System.out.println(number);

        int num2 = Integer.parseInt("321" + 0); // "3210"

        System.out.println(num2);
        // 如果遇到的字符串中包含了非数字的情况，就会转换失败，例如空格，或者abcd
        String special = "1221 ";
        int num3 = Integer.parseInt(special);
        System.out.println(num3);


    }
}

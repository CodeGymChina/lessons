package org.codegym.lessons.lesson_02;

/**
 * 一些常见的String方法
 * @author Scott Liu
 * @date 2022/2/19$
 */
public class CommonStringOperation {

    public static void main(String[] args) {

        String helloWorld = "Hello World";
        // 获取String对象内容的长度
        int length = helloWorld.length();
        System.out.println("length: " + length);
        // 转大写
        String upperCase = helloWorld.toUpperCase();
        System.out.println("upper case: " + upperCase);

        // 转小写
        String lowerCase = helloWorld.toLowerCase();
        System.out.println("lower case: " + lowerCase);

        // 截取指定部分值，java中0代表了开始
        String subString = helloWorld.substring(0,2); //index 0
        System.out.println(subString);

        // 移除字符串两边的空格
        String word = " a ";
        System.out.println(word);
        String trim = word.trim();
        System.out.println(trim);

        // 获取String对象中某个位置的字符
        char c = helloWorld.charAt(2);
        System.out.println(c);
    }
}

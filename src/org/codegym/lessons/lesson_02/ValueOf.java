package org.codegym.lessons.lesson_02;

/**
 * @author Scott Liu
 * @date 2022/2/19$
 */
public class ValueOf {

    public static void main(String[] args) {


        // valueOf是String类为我们提供的一种将基础类型转换为String类型的方法
        double d = 102.44;
        String dString = String.valueOf(d);
        System.out.println(d);
        int i = 10;
        String iString = String.valueOf(i);
        System.out.println(iString);

        char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
        System.out.println(arr);

    }
}

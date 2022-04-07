package org.codegym.lessons.lesson_14;

import org.codegym.lessons.lesson_14.p11.Son11;

/**
 * @author JC Liu
 * @date 2022/4/2$
 */
public class Test2 {

    public static void main(String[] args) {
        Integer result = interfaceDemo.myFun.apply("1200");
        System.out.println(result);

        boolean test = interfaceDemo.p.test(-1);
        System.out.println(test);

        String abc ="ab";
        interfaceDemo.consumer.accept(abc);
    }
}

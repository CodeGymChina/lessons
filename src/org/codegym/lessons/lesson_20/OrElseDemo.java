package org.codegym.lessons.lesson_20;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author JC Liu
 * @date 2022/4/23$
 */
public class OrElseDemo {

    public static void main(String[] args) {
        String text = "null";
        String defaultText = Optional.ofNullable(text).orElseGet(FunctionUtil.initString);
        System.out.println("1st: "+defaultText);
        defaultText = Optional.ofNullable(text).orElse(FunctionUtil.initString.get());
        System.out.println("2nd: "+defaultText);

    }

}

package org.codegym.lessons.lesson_14;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author JC Liu
 * @date 2022/4/2$
 */
public interface interfaceDemo {

    void add();

    // Functional programming
    // Supplier Function Consumer Predicate

    Function<String, Integer> myFun = (ele) -> {
        return (Integer) Integer.parseInt(ele);
    };

    Predicate<Integer> p = ele-> ele>1;

    Consumer<String> consumer = ele->{
        System.out.println(ele);
    };

    default void method() {
        System.out.println("method");
    }
}

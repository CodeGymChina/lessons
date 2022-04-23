package org.codegym.lessons.lesson_20;

import java.util.Optional;

/**
 * @author JC Liu
 * @date 2022/4/23$
 */
public class OptionalDemo {

    public static void main(String[] args) {
        Optional<String> str = Optional.of("Hello World");
//        if (str.isPresent()) {
//            System.out.println(str.get());
//        } else {
//            System.out.println("no str");
//        }
        String nullName = null;
        String s = Optional.ofNullable(nullName).orElse("it's a null value");
        System.out.println(s);
    }

    public void optionalMethod(User user) {
        if (user != null) {
            user.setName("not null");
        } else {
            System.out.println("user 为null");
        }
    }
}

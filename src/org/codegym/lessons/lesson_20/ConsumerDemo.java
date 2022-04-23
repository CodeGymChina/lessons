package org.codegym.lessons.lesson_20;

/**
 * @author JC Liu
 * @date 2022/4/23$
 */
public class ConsumerDemo {

    public static void main(String[] args) {
        User user = new User(18, "Alice");
        System.out.println(user);
        user.setName("new Name");
        System.out.println(user);

        FunctionUtil.consume.accept(user);
        System.out.println("After consume: "+ user);

    }
}

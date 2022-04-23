package org.codegym.lessons.lesson_20;

/**
 * @author JC Liu
 * @date 2022/4/23$
 */
public class SupplierDemo {

    public static void main(String[] args) {
        User user = new User(1, "bob");
        System.out.println(user);

        User user1 = FunctionUtil.initUser.get();
        System.out.println(user1);
    }
}

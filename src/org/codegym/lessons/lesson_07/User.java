package org.codegym.lessons.lesson_07;

/**
 * @desc: 测试类
 * @author: zhailihu
 * @date: 09/03/2022 15:22
 */
public class User {

    //成员变量
//    private int age;
//    private String name;

    //静态成员变量
    static String codeNum;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("User-->finalize() 被调用！");
    }

}

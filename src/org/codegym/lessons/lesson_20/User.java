package org.codegym.lessons.lesson_20;

import java.io.Serializable;

/**
 * @author JC Liu
 * @date 2022/4/23$
 */
public class User extends Parent {

//    // serialVersionUID
//    private static final long serialVersionUID = 1L;

    private int age;

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

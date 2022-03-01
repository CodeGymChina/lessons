package org.codegym.lessons.lesson_04;

/**
 * @author JC Liu
 * @date 2022/2/26$
 */
public class Person {

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

    private void speak() {
        System.out.println("hello");
    }

    public void method() {
        speak();
    }

}

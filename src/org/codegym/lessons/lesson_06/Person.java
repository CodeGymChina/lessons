package org.codegym.lessons.lesson_06;

/**
 * @author JC Liu
 * @date 2022/3/5$
 */
public class Person {

    // 确定类型，private 保证安全性
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // public 用于外部访问
    public void eat(String food) {
        System.out.println("今天吃了 " + food);
    }

    // private
    private void drink(String drink) {
        System.out.println("今天喝了"+ drink);
    }

    public void operate() {
        drink("啤酒");
    }

    public Person() {
    }

    public Person(String gender) {
        this.gender = gender;
    }

    public static Person getInstance() {
        return new Person();
    }

    public static void main(String[] args) {
        Person person = new Person();

        Person instance = Person.getInstance();
    }
}


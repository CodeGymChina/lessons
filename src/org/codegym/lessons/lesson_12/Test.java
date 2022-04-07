package org.codegym.lessons.lesson_12;

/**
 * @author JC Liu
 * @date 2022/3/26$
 */
public class Test {

    public static void main(String[] args) {
//        Animal animal = new Cat();
//
//        animal.eat();

        Dog dog = (Dog) new Animal();
        dog.eat();

    }
}

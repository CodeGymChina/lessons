package org.codegym.lessons.lesson_06;

/**
 * @author JC Liu
 * @date 2022/3/5$
 */
public class Car extends Vehicle{

    public void move() {
        System.out.println("move");
    }

    @Override
    public void fatherMethod() {
        System.out.println("子类重写父类");
    }
}

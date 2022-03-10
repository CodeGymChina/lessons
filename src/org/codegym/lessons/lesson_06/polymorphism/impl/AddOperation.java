package org.codegym.lessons.lesson_06.polymorphism.impl;

import org.codegym.lessons.lesson_06.polymorphism.Action;
import org.codegym.lessons.lesson_06.polymorphism.Operation;
import org.codegym.lessons.lesson_06.polymorphism.Shape;

/**
 * @author JC Liu
 * @date 2022/3/5$
 */
public class AddOperation extends Shape implements Operation, Action{
    @Override
    public void operate(int num) {
        System.out.println(num + num);
    }

    @Override
    public void attack() {

    }

    @Override
    public void draw() {
        System.out.println("Add");
    }
}

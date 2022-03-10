package org.codegym.lessons.lesson_06.polymorphism.impl;

import org.codegym.lessons.lesson_06.Vehicle;
import org.codegym.lessons.lesson_06.polymorphism.Action;
import org.codegym.lessons.lesson_06.polymorphism.Operation;

/**
 * @author JC Liu
 * @date 2022/3/5$
 */
public class ComplexImpl extends Vehicle implements Action, Operation {

    @Override
    public void attack() {
        System.out.println("我可以开始攻击");
    }

    @Override
    public void operate(int num) {
        System.out.println("我要进行一些操作");
    }
}

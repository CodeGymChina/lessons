package org.codegym.lessons.lesson_06.polymorphism.impl;

import org.codegym.lessons.lesson_06.polymorphism.Operation;

/**
 * @author JC Liu
 * @date 2022/3/5$
 */
public class MultipleOperation implements Operation {
    @Override
    public void operate(int num) {
        System.out.println(num * num);
    }
}

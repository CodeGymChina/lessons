package org.codegym.lessons.lesson_06.polymorphism.impl;

import org.codegym.lessons.lesson_06.polymorphism.Operation;

/**
 * @author JC Liu
 * @date 2022/3/5$
 */
public class MinusOperation implements Operation {
    @Override
    public void operate(int num) {
        System.out.println("传入的数字是："+ num);
    }
}

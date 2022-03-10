package org.codegym.lessons.lesson_06.polymorphism;

import org.codegym.lessons.lesson_06.polymorphism.impl.ComplexImpl;
import org.codegym.lessons.lesson_06.polymorphism.impl.MinusOperation;
import org.codegym.lessons.lesson_06.polymorphism.impl.OperationImpl;

/**
 * @author JC Liu
 * @date 2022/3/5$
 */
public class InterfaceExample {

    public static void main(String[] args) {
//        Operation operation1 = new OperationImpl();
//
        Operation operation2 = new MinusOperation();
//
//        operation1.operate(10);
//        operation2.operate(10);
//
//        Operation operation3 = new Operation() {
//            @Override
//            public void operate(int num) {
//                System.out.println("我只是new出来的");
//            }
//        };
//
//        operation3.operate(10);

        ComplexImpl impl = new ComplexImpl();

        impl.operate(19);
        impl.attack();

        impl.setType("只是一个demo");
        System.out.println(impl.getType());
    }
}

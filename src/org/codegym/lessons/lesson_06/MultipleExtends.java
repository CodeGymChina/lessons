package org.codegym.lessons.lesson_06;

/**
 * @author JC Liu
 * @date 2022/3/5$
 * Vehicle->Car->MultipleExtends
 */
public class MultipleExtends extends Car{

    @Override
    public void fatherMethod() {
        System.out.println("多层继承");
    }
}

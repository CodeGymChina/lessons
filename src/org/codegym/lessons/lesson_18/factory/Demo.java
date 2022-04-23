package org.codegym.lessons.lesson_18.factory;

/**
 * @author JC Liu
 * @date 2022/4/16$
 */
public class Demo {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape square = factory.getShape("square");
        square.draw();
    }
}

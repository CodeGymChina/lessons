package org.codegym.lessons.lesson_18.factory;

/**
 * @author JC Liu
 * @date 2022/4/16$
 */
public class ShapeFactory extends Demo {

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("triangle")) {
            return new Triangle();
        }
        return null;
    }
}

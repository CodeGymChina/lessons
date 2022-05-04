package org.codegym.lessons.lesson_23;

import org.codegym.lessons.lesson_13.Car;

public class SimpeAnnotationDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        //反射拿到Class对象
        Class clazz = myCar.getClass();
        SimpleAnnotation classAnnotation = (SimpleAnnotation) clazz.getAnnotation(SimpleAnnotation.class);
        System.out.println(classAnnotation.classDesc());
    }
}

package org.codegym.lessons.lesson_06.polymorphism;

/**
 * @author JC Liu
 * @date 2022/3/5$
 */
public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("这是圆形");
    }

    public Circle(){
        System.out.println("circle");
    }

    public static void main(String[] args) {
//        Shape circle = new Circle();
        Circle circle1 = new Circle();
    }
}

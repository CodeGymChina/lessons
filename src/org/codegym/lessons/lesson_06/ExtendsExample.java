package org.codegym.lessons.lesson_06;

/**
 * @author JC Liu
 * @date 2022/3/5$
 */
public class ExtendsExample {

    public static void main(String[] args) {
        // 子承父业

        Car car = new Car();
        car.setType("车");
        System.out.println(car.getType());
        car.move();
        Vehicle vehicle = new Vehicle();
        vehicle.setType("车");
        System.out.println(vehicle.getType());
        vehicle.fatherMethod();
        car.fatherMethod();

        MultipleExtends multipleExtends = new MultipleExtends();
        multipleExtends.fatherMethod();
    }
}

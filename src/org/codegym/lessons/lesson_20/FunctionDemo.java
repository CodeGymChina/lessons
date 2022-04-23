package org.codegym.lessons.lesson_20;

/**
 * @author JC Liu
 * @date 2022/4/23$
 */
public class FunctionDemo {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.setBrand("我只是一辆二轮自行车");
        bicycle.setWheelNumber(2);
        Car car = new Car();
        car.setWheelNumber(bicycle.getWheelNumber() * 2);
        car.setBrand(bicycle.getBrand());

        System.out.println(bicycle.toString());
        System.out.println(car.toString());

        System.out.println("Function refactor");

        Car newCar = FunctionUtil.bicycleToCar.apply(bicycle);
        System.out.println(newCar);

        System.out.println(FunctionUtil.subtract.apply(10, 100));


    }
}

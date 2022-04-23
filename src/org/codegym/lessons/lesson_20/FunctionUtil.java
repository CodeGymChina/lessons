package org.codegym.lessons.lesson_20;

import java.util.function.*;

/**
 * @author JC Liu
 * @date 2022/4/23$
 */
public interface FunctionUtil {

    Predicate<Integer> conditionTest = (ele) -> ele>18;
    BiPredicate<Integer, Integer> biPredicate = (ele, ele1) -> ele> 18 && ele1<60;

    Function<Bicycle, Car> bicycleToCar = (ele) -> {
        Car car = new Car();
        car.setBrand(ele.getBrand());
        car.setWheelNumber(ele.getWheelNumber() * 2);
        return car;
    };

    BiFunction<Integer, Integer, Integer> subtract = (a, b) -> {
        return a-b;
    };

    Consumer<User> consume = (ele) -> {
        ele.setName("name change");
    };

    Supplier<User> initUser = () -> {
        return new User(1, "new User");
    };

    Supplier<String> initString = () -> {
        return "default String";
    };

}

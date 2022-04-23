package org.codegym.lessons.lesson_20;

/**
 * @author JC Liu
 * @date 2022/4/23$
 */
public class Car {

    private int wheelNumber;

    private String brand;

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheelNumber=" + wheelNumber +
                ", brand='" + brand + '\'' +
                '}';
    }
}

package org.codegym.lessons.lesson_13;

import java.util.RandomAccess;

/**
 * @desc: 抽象类Vehicle
 *
 * 关于抽象类
 * JDK 1.8以前，抽象类的方法默认访问权限为protected
 * JDK 1.8时，抽象类的方法默认访问权限变为default
 *
 * 关于接口
 * JDK 1.8以前，接口中的方法必须是public的
 * JDK 1.8时，接口中的方法可以是public的，也可以是default的
 *
 *                       当前类                 当前包              子类              其他包
 *
 *   public              可以                    可以              可以               可以
 *   protected           可以                    可以              可以               不可以
 *   default             可以                    可以              不可以             不可以
 *   private             可以                    不可以            不可以             不可以
 *
 *
 * @author: zhailihu
 * @date: 27/03/2022 13:56
 */
abstract class Vehicle implements Cloneable, RandomAccess {
    private String color;
    private String brand;
    private int speed;

    abstract void drive();
    abstract void stop();
    abstract void park();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void fuel(){
        System.out.println("交通工具需要燃料");
    }

}

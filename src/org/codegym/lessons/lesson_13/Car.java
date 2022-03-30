package org.codegym.lessons.lesson_13;

/**
 * @desc: Car 交通工具Car实现类
 * @author: zhailihu
 * @date: 27/03/2022 14:17
 */
public class Car extends Vehicle implements IEngine {
    private int wheels;
    private String model;

    public Car() {
    }


    @Override
    void drive() {
        System.out.println("汽车正在行使");
    }

    @Override
    void stop() {
        System.out.println("减速停止");
    }

    @Override
    void park() {
        System.out.println("停车了");
    }

    @Override
    public void changeGear() {
        System.out.println("正在换挡：");
    }

    @Override
    public void speedUp() {
        setSpeed(100);
        System.out.println("现在速度: " + getSpeed());
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}

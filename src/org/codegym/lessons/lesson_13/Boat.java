package org.codegym.lessons.lesson_13;

/**
 * @desc:
 * @author: zhailihu
 * @date: 30/03/2022 20:21
 */
public class Boat extends Vehicle implements IEngine, IComponent {
    private int seat;

    @Override
    public void gps() {
        System.out.println("正在使用轮船的GPS导航!");
    }

    @Override
    public void autoDrive() {
        System.out.println("轮船自动驾驶");
    }

    @Override
    public void changeGear() {

    }

    @Override
    public void speedUp() {

    }

    @Override
    void drive() {

    }

    @Override
    void stop() {

    }

    @Override
    void park() {

    }
}

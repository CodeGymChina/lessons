package org.codegym.lessons.lesson_13;

/**
 * @desc:
 * @author: zhailihu
 * @date: 30/03/2022 20:26
 */
public class Plane extends Vehicle implements IEngine, IComponent{

    @Override
    public void gps() {

    }

    @Override
    public void autoDrive() {

    }

    @Override
    public void changeGear() {
        System.out.println("无级变速");
    }

    @Override
    public void speedUp() {
        setSpeed(200);
        System.out.println("正在提速" + getSpeed());
    }

    @Override
    void drive() {

    }

    @Override
    void stop() {

    }

    @Override
    void park() {
        System.out.println("已停靠");
    }
}

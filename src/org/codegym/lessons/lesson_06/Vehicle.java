package org.codegym.lessons.lesson_06;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author JC Liu
 * @date 2022/3/5$
 *
 * 交通工具
 */
public class Vehicle {

    private String type;

    private int year;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void fatherMethod() {
        System.out.println("父类方法");
    }

    public static Car getCar() {
        return new Car();
    }

    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
    }
}

package org.codegym.lessons.lesson_14.over;

import java.util.Arrays;

/**
 * @author JC Liu
 * @date 2022/4/2$
 */
public class Calculator {

    public int add(int num, int num2) {
        return num+num2;
    }

    public double add(double num, double num2){
        return num+num2;
    }

    public double add(double num, double num2, double num3){
        return num+num2+num3;
    }

    public double add(double[] num) {
        return Arrays.stream(num).sum();
    }

}

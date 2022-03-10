package org.codegym.lessons.lesson_06;

/**
 * @author JC Liu
 * @date 2022/3/5$
 */
public class OverLoadExample {

    public int add(int num1, int num2) {
        return num1+num2;
    }

//    public int add(int num1, int num2, int num3) {
//        return num1+num2+num3;
//    }

//    public double add(double num1, double num2) {
//        return num1+num2;
//    }
    // java会根据参数的长度去匹配方法，
    private double add(double num1, double num2) {
        return num1+num2;
    }
    public static void main(String[] args) {
        OverLoadExample example = new OverLoadExample();
        System.out.println("add 1:"+ example.add(1,2));
//        System.out.println("add 2:"+ example.add(1,2,3));
        System.out.println("private double add:" + example.add(2.5, 2.4));
//        OverLoadExample.main(new String[]{});

    }

    public static void main() {
        System.out.println("main方法重载");
    }
}

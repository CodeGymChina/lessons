package org.codegym.lessons.lesson_05;

/**
 * @desc: 比较运算符 && 布尔类型
 * @author: zhailihu
 * @date: 02/03/2022 09:19
 *
 *  运算符	结果
 *  ==	    等于
 *  !=	    不等于
 *  >	    大于
 *  <	    小于
 *  >=	    大于或等于
 *  <=	    小于或等于
 *
 */
public class CompareOperator {
    public static void main(String[] args) {

        boolean isGreater = 5 > 3; // true
        int age = 12;
        boolean isZero = age == 0; // false
        boolean isNonZero = !isZero; // true
        boolean isAdult = age >= 18; // false
        boolean isTeenager = age >6 && age <18; // true

        System.out.println(" isGreater = " + isGreater);
        System.out.println(" isZero = " + isZero);
        System.out.println(" isNonZero = " + isNonZero);
        System.out.println(" isAdult = " + isAdult);
        System.out.println(" isTeenager = " + isTeenager);
    }

}

package org.codegym.lessons.lesson_05;

/**
 * @desc: 三目运算符
 * @author: zhailihu
 * @date: 02/03/2022 09:08
 */
public class TernaryOperator {
    public static void main(String[] args) {

        int	a=80;
        int b=90;
        /**
         * 如果 a > b，则 greater = a ;
         * 如果 a < b, 则 greater = b ;
         */
        int greater  = a > b ? a : b ;

        System.out.println(" The greater is: " + greater);


    }
}

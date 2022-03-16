package org.codegym.lessons.lesson_08;

/**
 * @author JC Liu
 * @date 2022/3/12$
 */
public class UglyNumber {

    // 判断某个数是否只是由 3 5 7 相乘得到
    public static void main(String[] args) {
        // 3 5 7 9 15 21 25
        System.out.println(isUglyNumber(11));
        Integer number = new Integer(100);
        String str = (String) number.toString();
    }

    public static boolean isUglyNumber(int number) {
        while (number != 1) {
            if (number % 3 == 0) {
                number /=3;
            }
            if (number % 5 == 0) {
                number /= 5;
            }
            if (number % 7 == 0) {
                number /= 7;
            } else {
                break;
            }
        }
        return number == 1;
    }
}

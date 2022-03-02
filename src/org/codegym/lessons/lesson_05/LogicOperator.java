package org.codegym.lessons.lesson_05;

/**
 * @desc: 逻辑运算符 && 布尔类型
 * @author: zhailihu
 * @date: 02/03/2022 09:19
 *
 *  运算符	结果
 *  &	    按位与
 *  &&	    逻辑与（短路与）
 *  |	    按位或
 *  ||	    逻辑或（短路或）
 *  !	    逻辑非
 *  ^       逻辑异或（真假为真，真真为假）
 *
 *
 *
 *
 *
 *       按位与 举例说明：
 *
 *
 *       4:  1 0 0  (0000 0100)
 *           & & &
 *       7:  1 1 1  (0000 0111)
 *       ----------
 *       =   1 0 0  (0000 0100)   十进制 4
 *
 *
 *
 *       3:  0 1 1  (0000 0011)
 *           & & &
 *       5:  1 0 1  (0000 0101)
 *       -----------
 *       =   0 0 1  (0000 0001)   十进制 1
 *
 *
 *
 *
 *       逻辑与 举例说明：
 *
 *       int j = someFunc(1000 code);
 *       if ( i>=1 && i<= j  ){ ... }
 *
 *       此时，假设 i == 0，则系统判断出 i >= 1 的计算结果为false后，程序马上得出该逻辑表达式的最终计算结果为false，
 *       不用等待j的判断结果。
 *       短路计算功能可以提高程序的运行速度。
 *
 *       建议：实际开发中尽量多使用 && || 提高执行效率，减少代码复杂度。
 *
 *
 */
public class LogicOperator {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        boolean c = a | b; // true
        boolean d = a & b; // false
        boolean d1 = a && b; // false
        boolean e = a ^ b; // 真假为真，真真为假 true
        boolean f = !a; // false

//        System.out.println(" a = " + a);
//        System.out.println(" b = " + b);

        System.out.println(" a|b = " + c);
        System.out.println(" a&b = " + d);
        System.out.println(" a&&b = " + d1);
        System.out.println(" a^b = " + e);
        System.out.println(" !a = " + f);
    }

}

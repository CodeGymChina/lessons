package org.codegym.lessons.lesson_07;

/**
 * @desc: 静态内部类
 *
 * 内部类
 *
 * 1、内部类拥有普通类的所有特性，也拥有类成员变量的特性
 * 2、内部类可以访问其外部类的成员变量，属性，方法，其它内部类
 *
 * 静态内部类
 *
 * 1、只有内部类才能声明为static，也可以说是静态内部类
 * 2、只有静态内部类才能拥有静态成员，普通内部类只能定义普通成员
 * 3、静态类跟静态方法一样，只能访问其外部类的静态成员
 * 4、如果在外部类的静态方法中访问内部类，这时候只能访问静态内部类
 *
 * @author: zhailihu
 * @date: 09/03/2022 15:55
 */
public class OuterClass {
    private int outerVar1 = 1;
    private static int outerVar2 = 2;


    public static void main(String[] args) {
        //调用静态内部类
        System.out.println(StaticInnerClass.age);
    }

    /**
     * 普通内部类
     */
    public class NormalInnerClass {

//         private static int age = 22;
        private int age = 22; // 不能声明为static

        public NormalInnerClass() {
            // 可以访问外部类静态与非静态成员
            System.out.println(outerVar1);
            System.out.println(outerVar2);
        }

    }

    /**
     * 静态内部类
     */
    public static class StaticInnerClass {
        // 定义静态与非静态成员都是可以的
        private static int age = 22;
        private int age2 = 22;

        private void echo() {
//             System.out.println(outerVar1);
            System.out.println(outerVar2);// 只能访问外部类的静态成员
        }
    }
}
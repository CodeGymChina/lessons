package org.codegym.lessons.lesson_03;

/**
 * @desc:
 *
 * 1.Person类的实例化操作
 * 2.类的全限定类名 （包名+类名）
 * 3.对象的使用
 *      访问属性：对象名称.属性名
 *      访问方法：对象名称.方法名()
 *
 * @author: zhailihu
 * @date: 22/02/2022 22:30
 */
public class PersonTest {
    public static void main(String[] args) {
        Person zhangsan = new Person();

        //属性
        System.out.println("张三的身高是：" + zhangsan.height + "cm");
        System.out.println("张三的体重是：" + zhangsan.weight + "kg");

        //方法
        zhangsan.move();
        zhangsan.run();
        zhangsan.haveDinner();


        //获取Person类的全限定类名  包名+类名
        System.out.println(zhangsan.getClass().getName());

    }
}

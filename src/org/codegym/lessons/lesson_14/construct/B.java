package org.codegym.lessons.lesson_14.construct;

/**
 * @author JC Liu
 * @date 2022/4/2$
 */
public class B extends A{
    public B() {
        System.out.println("B的无参构造函数");
    }

    public B(String msg){
        //	super(msg); //此句代码表示调用父类A的有参构造函数，不加此句代码则表示调用父类A的默认无参构造函数
        System.out.println("B的有参构造函数: " + msg);
    }

    public void print() {
        System.out.println("B 的print方法");
    }

    public void add(){
        System.out.println("B 的add方法");
    }
}

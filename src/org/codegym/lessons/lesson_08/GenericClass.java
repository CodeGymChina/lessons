package org.codegym.lessons.lesson_08;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JC Liu
 * @date 2022/3/12$
 */
public class GenericClass <T> {

    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public GenericClass() {}

    public GenericClass(T data) {
        this.data = data;
    }
    public static void main(String[] args) {
//        GenericClass<String> str = new GenericClass<>();
//        System.out.println(str.getData());
//
//        str.setData("hello");
//        System.out.println(str.getData());


        int a = new Integer(30);
        System.out.println(a);

        Double d = 20.00;
        double unbox = d.doubleValue();
        System.out.println(unbox);

        Character c = 'a';
        char b = 'a';
        System.out.println(c.charValue() == b);

    }
}

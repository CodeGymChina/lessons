package org.codegym.lessons.lesson_08;

/**
 * @author JC Liu
 * @date 2022/3/12$
 */
public class Box<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.add("Hello ");
        System.out.println(stringBox.get());
        stringBox.add("world");

        System.out.println(stringBox.get());
    }
}

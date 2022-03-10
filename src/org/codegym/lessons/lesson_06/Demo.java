package org.codegym.lessons.lesson_06;

/**
 * @author JC Liu
 * @date 2022/3/5$
 */
public class Demo {

    public static void main(String[] args) {
        OverLoading.main(10);
        OverLoading.main(new String[]{});
    }

    public void showName() {
        System.out.println("Demo under Lesson 06");
    }
}

package org.codegym.lessons.lesson_06;

/**
 * @author JC Liu
 * @date 2022/3/5$
 */
public class DuplicatePractice {

    public static void main(String[] args) {
        // 同一个package下，我们引入同一个package下的类时，我们是不用写import语句的
        Demo demoInLesson06 = new Demo();
        demoInLesson06.showName();

        org.codegym.lessons.lesson_06.dir.Demo demoInDir = new org.codegym.lessons.lesson_06.dir.Demo();
        demoInDir.showName();
    }
}

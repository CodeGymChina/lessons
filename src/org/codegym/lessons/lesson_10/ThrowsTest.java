package org.codegym.lessons.lesson_10;

/**
 * @author JC Liu
 * @date 2022/3/19$
 */
public class ThrowsTest {

    public void throwException() {
        try {
            throw new Exception("这个是自己抛出的异常");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

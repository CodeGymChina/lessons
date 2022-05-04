package org.codegym.lessons.lesson_23;
import org.codegym.lessons.lesson_11.Person;

/**
 * 用户自定义异常
 */
public class ApplogDemo {
    public static void main(String[] args) {
        Person p = new Person();
        try{
            p.ageCalculation();
        }catch (Exception e ) {
            throw new AppException(1001,"用户年龄计算出现异常", e);
        }

    }
}

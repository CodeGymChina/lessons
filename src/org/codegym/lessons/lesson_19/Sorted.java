package org.codegym.lessons.lesson_19;

import org.codegym.lessons.lesson_11.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @desc:
 * sorted 方法一般用于排序，
 * 除非我们传递自定义比较器，否则流中的元素按自然顺序排序。
 *
 * @author: zhailihu
 * @date: 18/04/2022 22:55
 */
public class Sorted {
    public static void main(String[] args) {
        Person p1 = new Person("张三",18);
        Person p2 = new Person("李四",28);
        Person p3 = new Person("王五",38);

        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p3);
        personList.add(p2);

        personList.stream()
                .sorted(
                (e1,e2)->{
            return Integer.compare(e1.getAge(),e2.getAge());
        }).forEach(person -> {
            System.out.println(person.getAge());
        });







    }
}

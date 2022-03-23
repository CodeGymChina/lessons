package org.codegym.lessons.lesson_11;

import java.util.Set;
import java.util.TreeSet;

/**
 * @desc: TreeSet 练习
 *
 * @author: zhailihu
 * @date: 22/03/2022 16:34
 */
public class TreeSetTest {
    public static void main(String[] args) {
//        Set<Integer> set = new TreeSet<>();
//        set.add(1);
//        set.add(5);
//        set.add(3);
//        set.add(2);
//        System.out.println(set);
//
//        System.out.println("===============");
//        for(Integer i : set){
//            System.out.println(i);
//        }



        Set<Person> setPerson = new TreeSet<>();

        Person p1 = new Person("张三",28);
        Person p2 = new Person("李四",28);
        Person p3 = new Person("王五",38);

        setPerson.add(p1);
        setPerson.add(p2);
        setPerson.add(p3);

        for (Person p : setPerson){
            System.out.println(p.getName());
        }
//
//        System.out.println(setPerson);





    }

}

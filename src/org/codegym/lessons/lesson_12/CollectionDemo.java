package org.codegym.lessons.lesson_12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author JC Liu
 * @date 2022/3/26$
 */
public class CollectionDemo {

    public static void main(String[] args) {
        //ArrayList 任何元素，不去重，元素可以重复，容易OOM
        //HashMap key是唯一的，值可以不唯一
        //HashSet 元素唯一
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(list.size());
        removeDuplicateElement(list);
    }

    //hashset
    public static void removeDuplicateElement(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        set.addAll(list);
        System.out.println(set);
    }


}

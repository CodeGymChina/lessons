package org.codegym.lessons.lesson_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author JC Liu
 * @date 2022/3/12$
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//
        list.add(0);
        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4); // 5
//        list.add(5);

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//        System.out.println("移除数组前，list长度："+list.size());
//        list.remove(5);
//        System.out.println(list.get(4));
//
//        System.out.println("移除数组后，list长度："+list.size());

        System.out.println("list是否为空："+ list.isEmpty());
        System.out.println("list中元素的个数："+ list.size());
        System.out.println(list.contains(1));

//        while (list.iterator().hasNext()) {
//            Integer next = list.iterator().next();
//            System.out.println(next);
//        }

        for (Integer ele:list) {
            System.out.println(ele);
        }

        int[] ints = {5,8,2,3,7};
        Arrays.sort(ints);
        for(int i:ints) {
            System.out.print(i + " ");
        }
    }
}

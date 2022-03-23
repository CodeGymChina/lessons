package org.codegym.lessons.lesson_11;


import java.util.*;

/**
 * @desc: Set 练习
 *
 * 1.元素不能重复
 *
 * @author: zhailihu
 * @date: 21/03/2022 22:16
 */
public class HashSetTest {
    public static void main(String[] args) {
        //天然去重，适用于身份证、银行卡号等唯一编号场景
        Set<String> set = new HashSet<>();
//        System.out.println(set.add("120105199909094321")); // true
        System.out.println(set.add("123")); // true
        System.out.println(set.add("456")); // true
        System.out.println(set.add("789")); // true
        System.out.println(set);



        //出现重复的元素，不抛异常，直接返回false，多好的技能
//        System.out.println(set.add("120105199909094321")); // false



    }
}

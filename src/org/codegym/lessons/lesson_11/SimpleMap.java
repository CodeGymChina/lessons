package org.codegym.lessons.lesson_11;

import java.util.HashMap;
import java.util.Map;


/**
 * @desc: Map 练习
 *
 * @author: zhailihu
 * @date: 21/03/2022 16:59
 */
public class SimpleMap {
    public static void main(String[] args) {
        Map<String,String>  map=new HashMap<String,String>();
        map.put("1","Monday");
        map.put("one","Monday");
        map.put("2","Tuesday");
        map.put("3","Wednesday");

//        System.out.println(map.get("1"));
//        System.out.println(map.get("one"));
        map.remove("one");
        System.out.println(map.entrySet());

    }
}

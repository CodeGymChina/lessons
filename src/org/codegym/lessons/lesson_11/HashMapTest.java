package org.codegym.lessons.lesson_11;

import java.util.HashMap;
import java.util.Map;

/**
 * @desc: HashMap 练习
 *
 * @author: zhailihu
 * @date: 21/03/2022 16:59
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<String,String>  map=new HashMap<String,String>();
        map.put("1","Monday");
        map.put("one","Monday");
        map.put("2","Tuesday");
        map.put("3","Wednesday");

//        System.out.println(map.get("1"));
//        System.out.println(map.get("one"));
//        System.out.println(map.entrySet());

        //遍历Key
        for (String key : map.keySet()){
            System.out.println("Key = " + key);
        }

        //遍历Value
        for (String value: map.values()){
            System.out.println("Value = " + value);
        }


        //整体遍历
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }

        //Lambda表达式
//        map.forEach((k,v)->{
//            System.out.println("Key: " + k + ", Value: " + v);
//        });

    }
}

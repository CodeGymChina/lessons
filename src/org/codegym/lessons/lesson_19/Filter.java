package org.codegym.lessons.lesson_19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @desc: Stream Filter用法
 * @author: zhailihu
 * @date: 18/04/2022 22:48
 */
public class Filter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java","Golang","Php",".Net","Python","Nodejs","ReactJs");
        List<String> result = names.stream()
                //查找J开头的元素
                .filter(s -> s.startsWith("P"))
                //多个条件过滤
                .filter(s -> s.length() > 5 )
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}

package org.codegym.lessons.lesson_19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @desc:
 * collect 方法一般用于归并结果，
 * 一般操作会把stream的元素转换为一个集合。
 *
 * @author: zhailihu
 * @date: 18/04/2022 22:55
 */
public class Collect {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java","Golang","Php",".Net","Python","Nodejs","ReactJs");


        List<String> personListtoUpperCase = names.stream()
                .sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.print(personListtoUpperCase);



    }
}

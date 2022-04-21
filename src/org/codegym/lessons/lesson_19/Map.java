package org.codegym.lessons.lesson_19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @desc: Map 方法一般用于元素转换/运算，之后生成另一个Stream
 * @author: zhailihu
 * @date: 18/04/2022 22:51
 */
public class Map {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,3,4,5);

        List<Integer> twice = number.stream()
                //遍历每个元素，进行转换运算（2倍）,
                .map(x -> x*2)
                .collect(Collectors.toList());
        twice.forEach(System.out::println);

        //count用法
        System.out.println(number.stream().count());


    }
}

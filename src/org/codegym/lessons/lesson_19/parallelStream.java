package org.codegym.lessons.lesson_19;

import java.util.Arrays;
import java.util.List;

/**
 * @desc: parallelStream 并行操作
 *
 * @author: zhailihu
 * @date: 18/04/2022 23:37
 */
public class parallelStream {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        //parallelStream()
        number.parallelStream().forEach(num ->
                System.out.println(num + " " + Thread.currentThread().getName())
        );
    }
}

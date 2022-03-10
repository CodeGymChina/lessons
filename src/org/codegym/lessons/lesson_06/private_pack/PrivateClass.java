package org.codegym.lessons.lesson_06.private_pack;

import java.util.Scanner;

/**
 * @author JC Liu
 * @date 2022/3/5$
 * 类名之前如果不写public，那默认就是private
 * 高内聚，低耦合
 */
public class PrivateClass {

    public void print() {
        System.out.println("hello");

        Scanner scanner = new Scanner(System.in);
    }

}

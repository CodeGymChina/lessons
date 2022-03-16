package org.codegym.lessons.lesson_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author JC Liu
 * @date 2022/3/13$
 */
public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner a = new Scanner(System.in);
        double b = Double.valueOf(a.nextInt());
        double c;
        c = b % 5;
        if (c<5&&c>=4)
            System.out.println("红色");
        else if (c<4&&c>=3)
            System.out.println("黄色");
        else if (c<3&&c>=0)
            System.out.println("绿色");
    }
}

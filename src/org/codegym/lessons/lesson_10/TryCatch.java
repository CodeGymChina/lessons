package org.codegym.lessons.lesson_10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * @author JC Liu
 * @date 2022/3/19$
 */
public class TryCatch {

    public static void main(String[] args) throws Exception{
//        try{
//
//        } catch (ArithmeticException | InputMismatchException e) {
//            e.printStackTrace();
//        }
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        System.out.println(a/b);
        // if(条件A){}
        //else if(条件B){}
        //.... else
        caculate();
    }

    public static int caculate() throws Exception{
        return 5/0;
    }
}

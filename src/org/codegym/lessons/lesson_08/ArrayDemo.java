package org.codegym.lessons.lesson_08;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * @author JC Liu
 * @date 2022/3/12$
 */
public class ArrayDemo {

    //String ste = new String("asd")     String ste ="asd"

    public static void main(String[] args) {
////        String s = new String();
//        String s = "demo";
////        // "text" => string
//        // 我们需要定义数组的长度
//        int[] intArray = new int[10];
////        System.out.println(intArray[0]); // index 0
//        for (int i = 0; i < intArray.length; i++) {
//            if (i % 2 != 0) {
//                intArray[i] = 1;
//            } else {
//                intArray[i] = 2;
//            }
//        }
//        //enhanceFor(intArray);
////        whileLoop(intArray);
////        for (int i = 0; i < intArray.length; i++) {
////            System.out.println(intArray[i]);
////        }
//
//        // 在Java中，我们的数组都是从第0个元素开始，到length-1个元素结束
//        //System.out.println(intArray[9]);
//        System.out.println("enhance for loop:");
//        String[] strArr = new String[] {};
//        enhanceForString(strArr);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(maxStream(arr));
    }

    public static void whileLoop(int[] arr) {
        int n = 0;
        while (n < arr.length) {
            System.out.println(arr[n]);
            n++;
        }
    }

    public static void enhanceFor(int[] arr) {
        for(int ele:arr) { // 这里的ele代表的是当前的元素
            System.out.println(ele);
        }
    }

    public static void enhanceForString(String[] strArr) {
//        int number = 0;
        for (String str:strArr) {
            System.out.println(str);
        }
    }

    public static int maxValue(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            max = Math.max(max, j);
        }
        return max;
    }

    public static int maxStream(int[] arr) {
        OptionalInt max = Arrays.stream(arr).min();
        return max.getAsInt();
    }
}

package org.codegym.lessons.lesson_10;

/**
 * @author JC Liu
 * @date 2022/3/19$
 */
public class TryCatchFinally {

    public static void main(String[] args) {

        try{
            int[] arr = new int[5];
            System.out.println("--------------");
            System.out.println(arr[6]);
            System.out.println("=====");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("数组第7个元素不存在");
        }
    }
}

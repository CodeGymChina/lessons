package org.codegym.lessons.lesson_09;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * @desc: ArrayList动态扩容（内部原理）
 * @author: zhailihu
 * @date: 16/03/2022 06:32
 *
 * 1、  创建ArrayList时最好指定容量，减少数组频繁的扩容
 * 2、  在第一次添加元素时，会计算数组容量
 * 3、  JDK8 数组可以指定容量初始化，如果没有指定或者指定容量为0，
 *      空数组的长度会在添加第一个元素时会扩大到10(默认容量是10)，
 *      如果初始化时指定数组容量小于10，会被设置成10
 * 4、  add()是将元素添加到数组的尾部 O(1) 操作
 *
 */
public class ArrayListCapacity {
    public static void main(String[] args) {

        ArrayList<String> arrListHello = new ArrayList<String>();

        //增加
        arrListHello.add("l");
        arrListHello.add("love");
        arrListHello.add("codegym");

        arrListHello.add("我");
        arrListHello.add("想");
        arrListHello.add("努力");
        arrListHello.add("学习");
        arrListHello.add("Java");
        arrListHello.add("编程");
        arrListHello.add("技术");

        //容量
        System.out.println(getCapacity(arrListHello));
        arrListHello.add("！");
        System.out.println(getCapacity(arrListHello));

        //删除
        arrListHello.remove(4);


        //输出推荐两种遍历方式
//        for( String s : arrListHello){
//            System.out.println(s);
//        }

//        for( int i = 0 ; i < arrListHello.size() - 1; i ++ ){
//            System.out.println(arrListHello.get(i));
//        }

    }



    /**
     * ArrayList容量计算
     * @param list
     * @return
     */
    public static Integer getCapacity(ArrayList list) {
        Integer length = null;
        Class clazz = list.getClass();
        Field field;
        try {
            field = clazz.getDeclaredField("elementData");
            field.setAccessible(true);
            Object[] object = (Object[]) field.get(list);
            length = object.length;
            return length;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return length;
    }
}

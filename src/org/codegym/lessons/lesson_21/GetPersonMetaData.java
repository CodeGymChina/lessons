package org.codegym.lessons.lesson_21;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 拿到Person类的数据结构
 * Method[] Field[] Constructor[]
 */
public class GetPersonMetaData {
    public static void main(String[] args) {
        try{
            //获取Person类的Class对象（clazz）
            Class clazz = Class.forName("org.codegym.lessons.lesson_11.Person");

            //获取 Person 类的所有方法信息
            Method[] method=clazz.getDeclaredMethods();
            for(Method m : method){
                System.out.println(m.toString());
            }

            //获取 Person 类的所有成员属性信息
            Field[] field=clazz.getDeclaredFields();
            for(Field f:field){
                System.out.println(f.toString());
            }

            //获取 Person 类的所有构造方法信息
            Constructor[] constructor= clazz.getDeclaredConstructors();
            for(Constructor c : constructor){
                System.out.println(c.toString());
            }
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}

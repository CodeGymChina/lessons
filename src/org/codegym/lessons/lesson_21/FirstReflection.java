package org.codegym.lessons.lesson_21;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 认识一下反射
 */
public class FirstReflection {
    public static void main(String[] args) {
        try {
            //全限定名=包名+类名
            Class clazz = Class.forName("org.codegym.lessons.lesson_11.Person");
            //操作class对象的方法
            Method method = clazz.getMethod("setName", String.class);
            //生成一个新的Person对象并进行属性赋值
            Constructor constructor = clazz.getConstructor();
            Object object = constructor.newInstance();
            method.invoke(object, "张三");

            System.out.println(object.toString());

        }catch (Exception e){
            e.getStackTrace();
        }


    }
}

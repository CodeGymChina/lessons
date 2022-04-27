package org.codegym.lessons.lesson_21;

import org.codegym.lessons.lesson_11.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射创建一个新的Person实例，并进行初始化
 */
public class CreateObject {
    public static void main(String[] args) {
        try{
            //拿到Class对象  Class.forName() 安全、性能高
            Class clazz = Class.forName("org.codegym.lessons.lesson_11.Person");
            //使用Class对象的newInstance()方法创建新对象
            Person objPerson = (Person) clazz.newInstance();
            System.out.println("objPerson 对象:" +  objPerson.toString());

            //获取构造方法并创建对象
            Constructor c = clazz.getDeclaredConstructor(String.class, int.class);
            //创建对象并设置属性
            Person objPersonWithData = (Person) c.newInstance("李四",40);

            System.out.println(objPersonWithData.getName());
            System.out.println(objPersonWithData.getAge());
            System.out.println("objPerson 对象:" +  objPersonWithData);

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

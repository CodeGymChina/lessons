package org.codegym.lessons.lesson_21;

import org.codegym.lessons.lesson_11.Person;

/**
 * Class对象的3种获取方式
 */
public class GetClassObject {
    public static void main(String[] args)  {

        try {
            // 1.Class.forName
            Class clazz1 = Class.forName("org.codegym.lessons.lesson_11.Person");
            System.out.println(clazz1);
            // 2.Class.class
            Class clazz2 = Person.class;
            System.out.println(clazz2);
            // 3.obj.getClass()
            Person objPerson = new Person();
            Class clazz3 = objPerson.getClass();
            System.out.println(clazz3);

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

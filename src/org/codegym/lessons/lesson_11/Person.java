package org.codegym.lessons.lesson_11;

import org.codegym.lessons.lesson_23.Applog;
import org.codegym.lessons.lesson_23.OperationType;

/**
 * @author: zhailihu
 *
 * 实现Comparable接口，重写CompareTo()方法，实现自然排序
 * @date: 22/02/2022 22:22
 */

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person() { }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Applog(desc = "获取姓名", operateType = OperationType.QUERY)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Applog(desc = "年龄计算", operateType = OperationType.UPDATE)
    public int ageCalculation() {
        //故意抛处一个运行时异常
        int i = 1/0;
        return (this.age + 100);
    }

    /**
     * 如果当前对象this大于形参对象o，则返回正整数
     * 如果当前对象this小于形参对象o，则返回负整数
     * 如果当前对象this等于形参对象o，则返回零
     *
     * 主要关键字、次要关键字
     *
     * @param o
     * @return int
     */
    @Override
    public int compareTo(Person o) {
        //优先比较年龄（升序）
        int flag =  this.age - o.age;
        if (flag == 0){
            //如果年龄相等，再比较姓名字符串， String.compareTo() 默认升序
            flag = this.name.compareTo(o.name);
//            flag = this.stuNo - o.stuNo;

        }
        return flag;
    }

    @Override
    public String toString() {
        if (this.getName() != null)
            return this.getName();
        else
            return super.toString();
    }
}



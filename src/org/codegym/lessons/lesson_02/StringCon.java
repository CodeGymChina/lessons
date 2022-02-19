package org.codegym.lessons.lesson_02;

/**
 * @author Scott Liu
 * @date 2022/2/19$
 */
public class StringCon {

    public static void main(String[] args) {
        String firstName = "名";
        String lastName = "姓 ";

        String fullName = lastName + firstName;
        System.out.println(fullName);

        // 我们除了可以直接使用+号来拼接字符串，同时我们也可以使用StringBuilder工具类
        // 顾名思义，它是一个用来构建String对象的建造者。
        StringBuilder builder = new StringBuilder(); // 声明StringBuilder

        // 这里我们通过调用append方法来追加字符串，append的意思就是追加，即拼接。
        StringBuilder appendResult = builder.append(lastName)
                                            .append(firstName);

        System.out.println("拼接的结果："+appendResult);

        // 在拼接的时候，我们也需要注意到操作符的顺序性问题，这和数学中的运算顺序一致

        String str = "a = " + (19 +20);
        System.out.println("str: " + str); // 这里我们会优先计算括号内的结果，计算完毕后再进行拼接

        String str1 = "a =  (19 +20)";
        System.out.println("str1: " + str1); // 但如果这些数字是String的话，那么就不会进行运算，而是当做普通的String数据打印
    }
}

package org.codegym.lessons.lesson_20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author JC Liu
 * @date 2022/4/23$
 */
public class FilterDemo {

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User(50, "Alice"));
        userList.add(new User(30, "Bob"));
        userList.add(new User(5, "Ceui"));
        userList.add(new User(20, "David"));
        System.out.println("before:"+userList.size());
//        for (int i = 0; i < userList.size(); i++) {
//            if (FunctionUtil.conditionTest.test(userList.get(i).getAge())) {
//                userList.remove(i);
//            }
//        }
        List<User> collect = userList.stream()
                .filter(ele -> FunctionUtil.biPredicate.test(ele.getAge(), ele.getAge()))
                .collect(Collectors.toList());
        System.out.println("after:"+collect.size());

    }
}

package com.codegym.pojo;

/**
 * @author JC Liu
 * @date 2022/5/7$
 */
public class UnitTestLearning {

    public int add(int num) {
        return num+num;
    }

    public boolean test(int num) {
        if (num > 10) {
            return true;
        } else
            throw new NullPointerException();
    }
}

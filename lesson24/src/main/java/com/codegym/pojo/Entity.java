package com.codegym.pojo;

/**
 * @author JC Liu
 * @date 2022/5/7$
 */
public class Entity {

    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void print(int num) {
        if (num > 0) {
            System.out.println("大于零");
        } else if (num == 0) {
            System.out.println("等于零");
        } else {
            System.out.println("小于零");
        }
        // 调用其他方法
        // mapper.selectAll()
    }

    public String hello() {
        print(1);
        return "string";
    }
}

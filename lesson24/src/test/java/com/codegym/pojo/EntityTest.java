package com.codegym.pojo;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author JC Liu
 * @date 2022/5/7$
 */
class EntityTest {

    @Test
    public void testMethodOne() {
        System.out.println(this.getClass() + "-testMethodOne-" + Thread.currentThread().getName());
    }

    @Test
    public void testMethodTwo() {
        System.out.println(this.getClass() + "-testMethodTwo-" + Thread.currentThread().getName());
    }

    @Test
    public void getNumTest() {
        //.....
    }

    @Test
    public void printForLargerThanZero() {

    }

    @Test
    public void printForEqualZero() {

    }

    @Test
    public void printForSmallerThanZero() {

    }
}
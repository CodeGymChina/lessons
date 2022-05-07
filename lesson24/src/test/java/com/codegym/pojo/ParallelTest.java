package com.codegym.pojo;

import org.junit.jupiter.api.Test;

/**
 * @author JC Liu
 * @date 2022/5/7$
 */
public class ParallelTest {
    @Test
    public void testMethodOne() {
        System.out.println(this.getClass() + "-testMethodOne-" + Thread.currentThread().getName());
    }

    @Test
    public void testMethodTwo() {
        System.out.println(this.getClass() + "-testMethodTwo-" + Thread.currentThread().getName());
    }
}

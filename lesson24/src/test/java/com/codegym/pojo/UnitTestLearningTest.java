package com.codegym.pojo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author JC Liu
 * @date 2022/5/7$
 */
class UnitTestLearningTest {

    @Test
    public void testMethod() {
        System.out.println("Hello Unit Test");
    }

    @Test
    public void addMethodTest() {
        int num = 10;
        UnitTestLearning test = new UnitTestLearning();
        int add = test.add(num);
        Assertions.assertEquals(20, add, "All works");
    }

    @Test
    public void booleanTest() {
        int num = 20;
        UnitTestLearning test = new UnitTestLearning();
        boolean flag = test.test(num);
        Assertions.assertEquals(true, flag);

        Assertions.assertTrue(flag);
    }

    @Test
    public void ExceptionTest() {
        int num = 5;
        UnitTestLearning test = new UnitTestLearning();
        Assertions.assertThrows(NullPointerException.class, () -> test.test(num));
    }
}
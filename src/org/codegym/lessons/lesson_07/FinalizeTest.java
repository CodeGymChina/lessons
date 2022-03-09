package org.codegym.lessons.lesson_07;

/**
 * @desc: Finalize方法
 *
 * finalize()方法中一般用于释放非资源（如打开的文件资源、数据库连接等）,
 * 或是调用非Java方法（native方法）时分配的内存。
 *
 * 1.对象未覆盖 finalize 方法，不执行
 * 2.finalize已经被调用过一次，不执行
 * 3.jvm不保证finalize能完整执行
 *
 * @author: zhailihu
 * @date: 09/03/2022 15:23
 */
public class FinalizeTest {
    public static void main(String[] args) throws InterruptedException {
        User user = new User();  //Cat
        user = null;
        System.gc();

    }
}

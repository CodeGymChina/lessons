package org.codegym.lessons.lesson_17;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * InputStream 2个read()
 *
 * 1. read() 每次读取一个字节
 * 2. read(byte b[]) 每次读取一个固定长度的数组
 *
 * @desc: InputStream 输入流
 * @author: zhailihu
 * @date: 28/03/2022 18:09
 */
public class InputStreamDemo {
    public static void main(String[] args) {
        //手动定义byte数组
        byte[] charArray = new byte[100];

        try {
            //打开一个输入流（相对路径）
            InputStream input = new FileInputStream("src/org/codegym/lessons/lesson_17/input.txt");
            System.out.println("获取流中可读取的数据大小: " + input.available());

            /**
             * TODO： 敲黑板
             * 看源码，得结论
             */
            input.read(charArray);

            System.out.println("从文件中读取数据: ");

            //转换Byte为String类型
            String data = new String(charArray);
            System.out.println(data);

            //关闭输入流
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}

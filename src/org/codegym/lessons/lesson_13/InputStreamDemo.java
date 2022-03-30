package org.codegym.lessons.lesson_13;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @desc: InputStream 输入流
 * @author: zhailihu
 * @date: 28/03/2022 18:09
 */
public class InputStreamDemo {
    public static void main(String[] args) {
        byte[] charArray = new byte[100];

        try {
            //打开一个输入流（相对路径）
            InputStream input = new FileInputStream("src/org/codegym/lessons/lesson_13/input.txt");
            System.out.println("获取流中可读取的数据大小: " + input.available());

            //从Inputstream中读取字节到array数组中
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

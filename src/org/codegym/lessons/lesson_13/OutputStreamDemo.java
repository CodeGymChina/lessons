package org.codegym.lessons.lesson_13;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @desc: OutputStream 输出流
 * @author: zhailihu
 * @date: 28/03/2022 23:20
 */
public class OutputStreamDemo {
    public static void main(String[] args) {
        String sourceData = "我们都喜欢Java，我们都喜欢CodeGym!";

        try {
            OutputStream out = new FileOutputStream("src/org/codegym/lessons/lesson_13/output.txt");

            //将数据源中的内容转换为字节，放入byte数组
            byte[] dataBytes = sourceData.getBytes();

            //把数据写到输出流
            out.write(dataBytes);
            System.out.println("数据已经被写到文件中了");

            //关闭输出流
            out.close();
        }catch (Exception e) {
            e.getStackTrace();
        }
    }
}

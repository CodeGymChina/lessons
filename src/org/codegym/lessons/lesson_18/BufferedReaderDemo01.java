package org.codegym.lessons.lesson_18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author JC Liu
 * @date 2022/4/16$
 */
public class BufferedReaderDemo01 {
    public static void main(String args[])throws IOException{
        BufferedReader buf = null ;		// 声明对象
        buf = new BufferedReader(new FileReader(new File("E:\\projects\\lessons\\demo.txt"))) ;	// 将字节流变为字符流
        String str1 = null ;	// 接收输入内容
        String str2 = null ;	// 接收输入内容
        System.out.println("请输入内容："); ;
        try{
            str1 = buf.readLine() ;	// 读取一行数据
            str2 = buf.readLine() ;	// 读取一行数据
        }catch(IOException e){
            e.printStackTrace() ;	// 输出信息
        }
        System.out.println("输入的内容为：" + str1) ;
        System.out.println("输入的内容为：" + str2) ;
    }
}

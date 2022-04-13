package org.codegym.lessons.lesson_17;

import java.io.IOException;

/**
 * @desc: MeidaInputStreamDemo 测试
 * @author: zhailihu
 * @date: 13/04/2022 11:34
 */
public class MeidaInputStreamDemo {
    public static void main(String[] args) throws IOException {
        MeidaInputStream mediaCopy=new MeidaInputStream();

        //8~9秒
//        long time1=System.currentTimeMillis();
//        //FileInputStream
//        mediaCopy.copy();
//        long time2=System.currentTimeMillis();
//        System.out.println("直接复制用时："+(time2-time1)+"毫秒");

        //1~2秒
        long time3=System.currentTimeMillis();
        //BufferedInputStream
        mediaCopy.copyByBuffer();
        long time4=System.currentTimeMillis();
        System.out.println("缓冲区复制用时："+(time4-time3)+"毫秒");


        //6~7秒
//        long time5=System.currentTimeMillis();
//        //BufferedInputStream
//        mediaCopy.fakeCopyByBuffer();
//        long time6=System.currentTimeMillis();
//        System.out.println("缓冲区复制用时："+(time6-time5)+"毫秒");


    }
}

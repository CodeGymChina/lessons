package org.codegym.lessons.lesson_17;

import java.io.*;

/**
 * @desc: MeidaInputStream  文件拷贝
 * @author: zhailihu
 * @date: 13/04/2022 11:26
 */
public class MeidaInputStream {

    private static File file = new File("/Users/Squall/Documents/Zoom/2022-04-06 19.00.35 Lihu's Zoom Meeting/lesson_15.mp4");
    private static File file_copied = new File("/Users/Squall/Desktop/lesson_15_copy.mp4");

    /**
     * FileInputStream 复制
     * 面对I/O，注意严格使用Try/catch
     *
     */
    public void copy() {
        try {
            FileInputStream in = new FileInputStream(file);
            FileOutputStream out = new FileOutputStream(file_copied);
            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = in.read(buf)) != -1) {
                out.write(buf);
            }
            in.close();
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }


    /**
     * BufferedInputStream 复制
     * 另外一种写法，直接throw()，但是上游代码一定要做对这个异常的捕获
     *
     * @throws IOException
     */
    public void copyByBuffer() throws IOException {
        //打开文件输入流
        FileInputStream f = new FileInputStream(file);
        //构造输入缓冲流
        BufferedInputStream bufferedIn = new BufferedInputStream(new FileInputStream(file));
        //构造输出缓冲流
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file_copied));
        //构造一个输入流的长度的数组
        byte[] buf = new byte[f.available()];
        int len = buf.length;
        //read方法读到尾部时read方法将返回-1
        while (bufferedIn.read(buf, 0, len) != -1) {
            out.write(buf);
        }

        bufferedIn.close();
        out.close();
    }



    /**
     * BufferedInputStream 复制
     * 一种奇怪用法
     *
     * @throws IOException
     */
    @Deprecated
    public void fakeCopyByBuffer() throws IOException {
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file_copied));

        byte[] buf = new byte[1024];
        int len;
        //InputStream read(byte b[], int off, int len)
        while ((len = in.read(buf)) != -1) {
            out.write(buf);
        }
        in.close();
        out.close();
    }




}

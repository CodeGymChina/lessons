package org.codegym.lessons.lesson_11;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @desc:
 * @author: zhailihu
 * @date: 23/03/2022 20:55
 */
public class DateTest {
    public static void main(String[] args) {
        //使用 SimpleDateFormat 格式化日期
        Date date= new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
        System.out.print("当前时间为: " + ft.format(date));
    }
}

package org.codegym.lessons.lesson_23;

import java.io.IOException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * 日志工具类
 */
public class LogUtil {
    //声明一个java.util包的log对象，名字为myLog
    private static Logger logger = Logger.getLogger(LogUtil.class.getName());
    private static final String logFile = "src/org/codegym/lessons/lesson_23/app_log.log";
    /**
     * 日志打印
     */
    public static void printLog(int code, String appMessage, Throwable e) throws ClassNotFoundException, IOException, InterruptedException {
        //获取抛出异常的类的全限定名
        String curClass = e.getStackTrace()[0].getClassName();
        //拿到抛处异常的具体方法名
        String exMethodName = e.getStackTrace()[0].getMethodName();

        //通过类的全限定名初始化Class对象
        Class clazz = Class.forName(curClass);
        Method[] methods = clazz.getDeclaredMethods();
        for (final Method m : methods) {
            //通过isAnnotationPresent()方法来判断是否使用了注解
            if(m.isAnnotationPresent(Applog.class)){
                if (exMethodName.equals(m.getName())) {
                    //如果抛处异常的方法上标注了注解
                    String desc = m.getAnnotation(Applog.class).desc();
                    OperationType type = m.getAnnotation(Applog.class).operateType();

                    //借助FileHandler帮助logger做日志文件写入
                    FileHandler fh = new FileHandler(logFile);
                    logger.addHandler(fh);
                    //使用SimpleFormatter把日志中的XML格式代码去除，直接输出文本
                    SimpleFormatter formatter = new SimpleFormatter();
                    fh.setFormatter(formatter);

                    //单线程情况下追求性能可以使用StringBuilder
                    StringBuilder sb = new StringBuilder();
                    //格式化构造日志信息
                    sb.append("\n");
                    sb.append("{");
                    sb.append("\n");
                    sb.append("异常方法：" + m.getName() + " , \n");
                    sb.append("方法说明：" + desc + " , \n");
                    sb.append("操作类型：" + type.getOper() + " , \n");
                    sb.append("异常信息：" +  appMessage + " , " + e.getMessage() + " , \n");
                    sb.append("异常代码：" +  code  + " , \n");
                    sb.append("记录时间：" + DateFormat.getDateTimeInstance().format(new Date()));
                    sb.append("\n");
                    sb.append("}");

                    //正式写入日志
                    logger.info(sb.toString());

//                    while (true){
//                        logger.info(sb.toString());
//                        Thread.sleep(2000);
//                    }
                }
            }
        }
    }


}

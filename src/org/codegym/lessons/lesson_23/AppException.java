package org.codegym.lessons.lesson_23;

/**
 * 系统（0级系统/1级系统....0级最底层（基础））
 * 异常（系统异常 || 应用/用户异常）
 *
 * 自定义应用级异常类
 *
 * "用户登录异常" -> 应用级异常 异常代码 1001
 * "数据初始化失败" -> 应用级异常 0001
 */
public class AppException extends RuntimeException {
    /**
     * @param code 应用级异常代码
     * @param exMessage 应用级异常信息
     * @param e 异常对象
     */
    public AppException(int code, String exMessage, Throwable e) {
        try {
            //日志打印
            LogUtil.printLog(code, exMessage, e);
        }catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}

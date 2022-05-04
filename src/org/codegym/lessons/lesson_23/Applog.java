package org.codegym.lessons.lesson_23;

import java.lang.annotation.*;

/**
 * 自定义注解
 * Retention 保留策略（注解生效的生命周期）
 * Target 目标类型
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Applog {
    /**
     * 方法描述
     */
    String desc() default "";

    /**
     * 操作类型
     * 1:增加
     * 2:删除
     * 3:修改
     * 4:查询
     */
    OperationType operateType() default OperationType.QUERY;
}

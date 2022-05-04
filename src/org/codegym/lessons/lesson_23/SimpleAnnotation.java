package org.codegym.lessons.lesson_23;


import java.lang.annotation.*;

/**
 * 简单注解使用
 *
 * 注意三要素
 * @interface
 * @Target
 * @Retention
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface SimpleAnnotation {
    /**
     * 类描述
     */
    String classDesc();

}

package com.dxt2.dagger2demo2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

/**
 * Created by Administrator on 2018/6/6 0006.
 */
//@Retention(RetentionPolicy.RUNTIME)表示注解可以保留到class文件中
// @Target 表示注解可以修饰属性和方法

//使用@Qualifier注解类型来定义一个新的注解类型 WMouseType，让它来指定创造哪种类型的Mouse对象
//@WMouseType可以修饰方法和成员变量，默认的注解参数是“wired” 表示有线鼠标
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface WMouseType {
    String value() default "wired";
}


























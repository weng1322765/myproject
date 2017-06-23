package com.common.utils;

import org.slf4j.LoggerFactory;


/**
 * Created by WengLei on 2017/6/15.
 *
 */
public class Logger {

    public static org.slf4j.Logger get() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        return LoggerFactory.getLogger(stackTrace[2].getClassName());
    }

    public static void info(Class<?> clazz, String msg, Object... args) {
        LoggerFactory.getLogger(clazz).info(format(msg, args));
    }

    public static void debug(Class<?> clazz, String msg, Object... args) {
        LoggerFactory.getLogger(clazz).debug(format(msg, args));
    }

    public static void error(Class<?> clazz, String msg, Throwable ex, Object... args) {
        LoggerFactory.getLogger(clazz).error(format(msg, args), ex);
    }

    public static void info(Class<?> clazz, String msg) {
        LoggerFactory.getLogger(clazz).info(msg);
    }

    public static void debug(Class<?> clazz, String msg) {
        LoggerFactory.getLogger(clazz).debug(msg);
    }

    public static void error(Class<?> clazz, String msg, Throwable ex) {
        LoggerFactory.getLogger(clazz).error(msg, ex);
    }


    /**
     * slf4j带占位符文本格式化
     *
     * @param template 带占位符{}的文本
     * @param values   {}对应的参数值
     * @return 格式化后的文本
     */

    private static String format(String template, Object... values) {
        return String.format(template.replace("{}", "%s"), values);
    }

}

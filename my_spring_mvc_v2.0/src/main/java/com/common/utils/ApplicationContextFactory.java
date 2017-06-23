package com.common.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by WengLei on 2017/6/19.
 */
@Component
public class ApplicationContextFactory implements ApplicationContextAware {

    private static  ApplicationContext applicationContext;

    public  void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }





}

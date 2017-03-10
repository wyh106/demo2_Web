package com.app.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by lenovo on 2017/3/10.
 * 使用@WebListener注解，实现ServletContextListener接口
 */
@WebListener
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        System.out.println("ServletContex初始化");
    }

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        System.out.println("ServletContex销毁");
    }
}

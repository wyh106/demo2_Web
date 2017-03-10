package com.testXML;

import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2017/3/10.
 */
@Service
public class HelloService {
    /**
     * 启动的时候观察控制台是否打印此信息;
     */
    public HelloService() {
        System.out.println("HelloService.HelloService()");
        System.out.println("org.kfit.service.HelloService.HelloService()");
        System.out.println("HelloService.HelloService()");
    }
}

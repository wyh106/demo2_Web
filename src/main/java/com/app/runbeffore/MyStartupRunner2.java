package com.app.runbeffore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by lenovo on 2017/3/10.
 * 服务启动时执行，加载一些数据
 */
@Component
@Order(value = 1)
public class MyStartupRunner2 implements CommandLineRunner{
    @Override
    public void run(String... args) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作 222222222222222 <<<<<<<<<<<<<");
    }
}

package com.app.runbeffore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by lenovo on 2017/3/10.
 * 服务启动时执行，加载一些数据
 */
@Component
@Order(value = 2)
public class MyStartupRunner1  implements CommandLineRunner{
    @Override
    public void run(String... args) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作 111111111111111 <<<<<<<<<<<<<");
    }
}

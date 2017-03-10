package com.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lenovo on 2017/3/10.
 * 测试改变自动扫描包【默认扫描的是App.java同目录或子目录下的类】
 * 选择configuration注解的CommandLineRunner类，是为了程序已启动就能看到效果
 */
@Configuration
public class MyCommandLineRunner1 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("MyCommandLineRunner1.run()");
    }
}

package com.app.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lenovo on 2017/3/10.
 * 将配置文件的内容通过对象的形式使用
 */
@ConfigurationProperties(prefix = "wisely2")
public class Wisely2Settings {
    private String name;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

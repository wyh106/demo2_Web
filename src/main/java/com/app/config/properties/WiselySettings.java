package com.app.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by lenovo on 2017/3/10.
 */
@ConfigurationProperties(prefix = "wisely",locations = "classpath:config/wisely.properties")
public class WiselySettings {
    private String name;
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

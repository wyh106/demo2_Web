package com.app.web.controller;

import com.app.config.properties.Wisely2Settings;
import com.app.config.properties.WiselySettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lenovo on 2017/3/10.
 */
@Controller
public class TestController {
    @Autowired
    WiselySettings wiselySettings;

    @Autowired
    Wisely2Settings wisely2Settings;

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        System.out.println(wiselySettings.getGender() + "---" + wiselySettings.getName());
        System.out.println(wisely2Settings.getGender() + "===" + wisely2Settings.getGender());
        return "ok";
    }
}

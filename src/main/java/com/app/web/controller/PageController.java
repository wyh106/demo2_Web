package com.app.web.controller;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

/**
 * Created by lenovo on 2017/3/10.
 */
@Controller
public class PageController implements EnvironmentAware{
    @Override
    public void setEnvironment(Environment environment) {
        String s = environment.getProperty("JAVA_HOME");
        System.out.println(s);
    }
}

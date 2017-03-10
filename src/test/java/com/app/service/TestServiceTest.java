package com.app.service;

import com.app.Demo2WebApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by lenovo on 2017/3/10.
 */
public class TestServiceTest extends Demo2WebApplicationTests {

    @Autowired
    private TestService testService;

    @Test
    public void getName() throws Exception {
        Assert.assertEquals("hello",testService.getName());
    }

}
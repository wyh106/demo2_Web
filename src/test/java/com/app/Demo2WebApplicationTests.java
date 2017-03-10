package com.app;

import com.app.Demo2WebApplication;
import com.app.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
//// SpringJUnit支持，由此引入Spring-Test框架支持！
@RunWith(SpringJUnit4ClassRunner.class)
//// 指定我们SpringBoot工程的Application启动类
@SpringApplicationConfiguration(classes = Demo2WebApplication.class)
///由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上
@WebAppConfiguration
public class Demo2WebApplicationTests {

	@Test
	public void contextLoads() {
	}

}

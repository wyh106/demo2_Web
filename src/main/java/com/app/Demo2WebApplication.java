package com.app;

import com.app.config.properties.Wisely2Settings;
import com.app.config.properties.WiselySettings;
import com.app.web.servlet.MyServlet1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ServletComponentScan  // 这个就是扫描相应的Servlet包，结合注解注册serlvet使用
@EnableConfigurationProperties({WiselySettings.class,Wisely2Settings.class})
//可以使用：basePackageClasses={},basePackages={}
@ComponentScan(basePackages={"com.test","com.app"})
public class Demo2WebApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(Demo2WebApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return super.configure(builder);
	}

	/**
	 * 注册Servlet.不需要添加注解：@ServletComponentScan
	 * @return
	 */
	@Bean
	public ServletRegistrationBean MyServlet1(){
		return new ServletRegistrationBean(new MyServlet1(),"/myServlet/*");
	}
}

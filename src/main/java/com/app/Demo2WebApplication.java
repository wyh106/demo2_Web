package com.app;

import com.app.config.properties.Wisely2Settings;
import com.app.config.properties.WiselySettings;
import com.app.web.servlet.MyServlet1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.MultipartConfigFactory;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.servlet.MultipartConfigElement;

@SpringBootApplication
@ServletComponentScan  // 这个就是扫描相应的Servlet包，结合注解注册serlvet使用
@EnableConfigurationProperties({WiselySettings.class,Wisely2Settings.class})
//可以使用：basePackageClasses={},basePackages={}
@ComponentScan(basePackages={"com.test","com.app"})
public class Demo2WebApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(Demo2WebApplication.class, args);
	}

	// 对文件做一些限制是有必要的，在App.java进行编码配置
	@Bean
	public MultipartConfigElement multipartConfigElement() {
		MultipartConfigFactory factory = new MultipartConfigFactory();
		//// 设置文件大小限制 ,超了，页面会抛出异常信息，这时候就需要进行异常信息的处理了;
		factory.setMaxFileSize("128KB"); //KB,MB
		/// 设置总上传数据总大小
		factory.setMaxRequestSize("256KB");
		//Sets the directory location where files will be stored.
		//factory.setLocation("路径地址");
		return factory.createMultipartConfig();
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

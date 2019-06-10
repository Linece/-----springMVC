package com.zdc.mvc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.zdc.mvc.config.AppConfig;
import com.zdc.mvc.config.RootConfig;

//web容器启动的时候创建对象，调用方法来初始化容器以前前端控制器
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	//获取根容器的配置类（spring的配置文件）父容器
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[]{RootConfig.class};
	}

	//获取web容器的配置类（spring mvc的配置文件）子容器
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[]{AppConfig.class};
	}

	
	//获取dispatcherServlet的映射信息
	
	//  /;拦截所有请求（包括静态资源），但是不包括*.jsp
	///*;拦截所有请求;包括*.jsp
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[]{"/"};
	}
}

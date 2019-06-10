package com.zdc.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.zdc.mvc.controller.MyfirstInter;
//Spring 的容器扫描Controller
//useDefaultFilters=false；禁用默认规则
@ComponentScan(value = "com.zdc.mvc",includeFilters={@Filter(type=FilterType.ANNOTATION,classes={Controller.class})},useDefaultFilters=false)
@EnableWebMvc
public class AppConfig extends WebMvcConfigurerAdapter{

	//配置页面访问路径
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub
		//默认所有的jsp页面都从/WEB-INF/XX.jsp
		//registry.jsp();
		//自己配置页面路径
		registry.jsp("/WEB-INF/view/", ".jsp");
	}
	
	//配置静态资源访问
	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	//配置拦截器
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(new MyfirstInter()).addPathPatterns("/**");
	}
}

package com.zdc.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

//Spring 的容器不扫描Controller;父容器
@ComponentScan(value = "com.zdc.mvc",excludeFilters={@Filter(type=FilterType.ANNOTATION,classes={Controller.class})})
public class RootConfig {

}

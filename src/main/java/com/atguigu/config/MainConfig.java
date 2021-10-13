package com.atguigu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

import com.atguigu.bean.Person;

//配置类=配置文件
@Configuration  //告诉我们这是一个配置类
@ComponentScan(value = "com.atguigu", includeFilters = {
	@Filter(type = FilterType.ANNOTATION,classes = {Controller.class})	
},useDefaultFilters = false)
public class MainConfig {
	//给容器中注册一个bean；类型为返回值的类型，id默认是用方法名作为id
	@Bean("person")
	public Person person01() {
		return new Person("lili",20);
	}
}

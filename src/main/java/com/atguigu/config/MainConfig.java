package com.atguigu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

import com.atguigu.bean.Person;

//������=�����ļ�
@Configuration  //������������һ��������
@ComponentScan(value = "com.atguigu", includeFilters = {
	@Filter(type = FilterType.ANNOTATION,classes = {Controller.class})	
},useDefaultFilters = false)
public class MainConfig {
	//��������ע��һ��bean������Ϊ����ֵ�����ͣ�idĬ�����÷�������Ϊid
	@Bean("person")
	public Person person01() {
		return new Person("lili",20);
	}
}

package com.atguigu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig;

public class MainTest {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//		Person bean = (Person)applicationContext.getBean("person");
//		System.out.println(bean);
		
		new AnnotationConfigApplicationContext(MainConfig.class);
	}
}

package com.atguigu.test;

import java.util.Iterator;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig;

public class IOCTest {
	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
	
	@SuppressWarnings("resource")
	@Test
	public void test01()
	{
		//这就是IOC容器
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		String[] definitionNames = applicationContext.getBeanDefinitionNames();
		for(String name:definitionNames)
		{
			System.out.println(name);
		}
	}
	
	//阿斯顿发
	/**
	 * 阿斯顿发
	 */
	//第二次提交，相应的1加一点东西，这个并不是什么很难得事情
	@Test
	public void test02()
	{
		String[] namesForType = applicationContext.getBeanNamesForType(Person.class);
		for(String name:namesForType)
		{
			System.out.println(name);
		}
		Map<String, Person> beansOfType = applicationContext.getBeansOfType(Person.class);
		System.out.println(beansOfType);
	}
}

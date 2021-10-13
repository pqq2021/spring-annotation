package com.atguigu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

import com.atguigu.bean.Person;
import com.atguigu.conditioin.LinuxCondition;
import com.atguigu.conditioin.WindowsCondition;

public class MainConfig2 {
	
	/**
	 * @Conditional,按照一定的条件进行判断，满足条件给容器注入bean
	 * @return
	 */
	@Conditional(WindowsCondition.class)
	@Bean("bill")
	public Person person01()
	{
		return new Person("Bill core",66);
	}
	
	@Conditional(LinuxCondition.class)
	@Bean("linus")
	public Person person02()
	{
		return new Person("Linus",48);
	}
}

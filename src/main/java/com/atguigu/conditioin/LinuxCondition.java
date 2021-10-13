package com.atguigu.conditioin;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javafx.stage.Window;

public class LinuxCondition implements Condition{

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		//1���ܻ�ȡIOcʹ�õ�beanFactory
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
		
		//2����ȡ�������
		ClassLoader classLoader = context.getClassLoader();
		
		//3����ȡ��ǰ������Ϣ
		Environment environment = context.getEnvironment();
		
		//4����ȡbean�����ע����
		BeanDefinitionRegistry registry = context.getRegistry();
		
		String property = environment.getProperty("os.name");
		if(property.contains("linux"))
		{
			return true;
		}
		return false;
	}

}

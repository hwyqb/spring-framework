package com.xjfuuu;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * bean对象的后置处理器
 */
public class IocTestBeanPostProcessor implements BeanPostProcessor {

	public IocTestBeanPostProcessor() {
		System.out.println("BeanPostProcessor 实现类构造函数...");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if("iocTestBean".equals(beanName)) {
			System.out.println("BeanPostProcessor 实现类 postProcessBeforeInitialization 方法被调用中......");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if("iocTestBean".equals(beanName)) {
			System.out.println("BeanPostProcessor 实现类 postProcessAfterInitialization 方法被调用中......");
		}
		return bean;
	}
}
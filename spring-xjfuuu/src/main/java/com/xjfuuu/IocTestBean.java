package com.xjfuuu;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * InitializingBean 初始化bean,afterPropertiesSet方法
 * ApplicationContextAware,注入ApplicationContext
 */
public class IocTestBean implements InitializingBean, ApplicationContextAware {

	//循环依赖
	private IocDependBean iocDependBean;

	//循环依赖注入
	public void setIocDependBean(IocDependBean iocDependBean) {
		this.iocDependBean = iocDependBean;
	}

	/**
	 * 构造函数
	 */
	public IocTestBean(){
		System.out.println("IocTestBean 构造器...");
	}


	/**
	 * InitializingBean 接口实现
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("IocTestBean 初始化器接口方法InitializingBean#afterPropertiesSet...");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext....");
	}
}

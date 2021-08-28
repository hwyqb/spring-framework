package com.xjfuuu;

/**
 * Ioc依赖Bean
 */
public class IocDependBean {

	private IocTestBean iocTestBean;

	public void setIocTestBean(IocTestBean iocTestBean) {
		this.iocTestBean = iocTestBean;
	}

	/**
	 * 构造函数
	 */
	public IocDependBean(){
		System.out.println("IocDependBean 构造器...");
	}
}

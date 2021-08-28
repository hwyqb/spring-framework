package com.xjfuuu;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * AopTestBean
 */
public class AopTestBean {

	public void print() {
		System.out.println("print方法业务逻辑执行");
	}
}

package com.xjfuuu;

/**
 * @author 应癫
 */
public class ItBean {

	private MyBean myBean;

	public void setMyBean(MyBean myBean) {
		this.myBean = myBean;
	}

	/**
	 * 构造函数
	 */
	public ItBean(){
		System.out.println("ItBean 构造器...");
	}
}

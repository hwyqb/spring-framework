import com.xjfuuu.AopTestBean;
import com.xjfuuu.IocTestBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTests {

	/**
	 *  Ioc测试案例
	 */
	@Test
	public void testIoC() {



		//ApplicationContext是容器的高级接口，是Spring应用上下文，IoC容器
		//BeanFacotry是（顶级容器/根容器，规范了/定义了容器的基础行为,比如加载资源等）
		//容器是一组组件和过程的集合，包括BeanFactory、单例池、BeanPostProcessor等以及之间的协作流程）

		/**
		 * Ioc容器创建管理Bean对象的，Spring Bean是有生命周期的
		 * 构造器执行、初始化方法执行、Bean后置处理器的before/after方法、：AbstractApplicationContext#refresh#finishBeanFactoryInitialization
		 * Bean工厂后置处理器初始化、方法执行：AbstractApplicationContext#refresh#invokeBeanFactoryPostProcessors
		 * Bean后置处理器初始化：AbstractApplicationContext#refresh#registerBeanPostProcessors
		 */
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		IocTestBean iocTestBean = applicationContext.getBean(IocTestBean.class);
		System.out.println(iocTestBean);
	}


	/**
	 *  AOP测试案例
	 */
	@Test
	public void testAOP() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		AopTestBean aopTestBean = applicationContext.getBean(AopTestBean.class);
		aopTestBean.print();
	}
}

package cn.edu.xidian.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld hw = (HelloWorld)context.getBean("helloWorld");
		hw.getMessage();
	}

}

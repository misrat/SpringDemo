package org.tanmay.javatutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 
 * 
 * 
 * MainApp modified for BeanPostProcessor demo
 * @author tanmay
 *
 */
public class MainApp {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		HelloWorld helloWorldObject = (HelloWorld) context.getBean("helloWorld1");
		System.out.println("Print the Object " + helloWorldObject);
		
		context.registerShutdownHook(); //auto calls the destroy method
		
	
	
	}

}

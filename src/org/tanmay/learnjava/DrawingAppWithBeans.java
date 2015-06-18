package org.tanmay.learnjava;

import java.nio.file.FileSystemAlreadyExistsException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * 1. Using Spring BeanFactory
 * 2. Using Application Context
 * 
 */

public class DrawingAppWithBeans {

	public static void main(String[] args) {
		//creating object with new method
//		Triangle triangle = new Triangle();
//		triangle.draw();
		
		//using Spring bean factory
//		String path = "C:\\Users\\tanmay\\allworkspaces\\j2ee_tutorial\\SpringDemo\\src\\spring.xml";
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource(path));
//		Triangle triangle = (Triangle)factory.getBean("triangle");
		
		//using application context
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle)context.getBean("triangle");
		
		
		triangle.draw();
		
				
		
	}

}

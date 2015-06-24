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

public class DrawingApp {
	public static void main(String[] args) {
		//using application context
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangleObject = (Triangle)context.getBean("triangle-alias");
		triangleObject.draw();
	}
}

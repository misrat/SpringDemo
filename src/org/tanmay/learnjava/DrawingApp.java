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
		Triangle triangle = (Triangle)context.getBean("triangle");
		Triangle triangle2 = (Triangle)context.getBean("triangle"); 
		Triangle triangle3 = (Triangle)context.getBean("triangle");
//		triangle.draw();
//		triangle2.draw();
		
		if(triangle.equals(triangle3)){
			System.out.println("Duplicate Object ");
		}else{
			System.out.println("Different Object");
		}
		
		
		
	}
}

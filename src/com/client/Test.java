package com.client;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.model.Student;

public class Test {

public static void main(String[] args) {
		
		
		Resource rc = new ClassPathResource("beans.xml");
		
		BeanFactory b = new XmlBeanFactory(rc);
			
			
			Student s = (Student) b.getBean("stu");
			System.out.println(s.getRollNo());
			System.out.println(s.getName());
	}
}

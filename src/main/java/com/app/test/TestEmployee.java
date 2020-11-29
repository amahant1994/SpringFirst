package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.Model.Employee;
import com.app.config.AppConfig;

public class TestEmployee {

	public static void main(String[] args) {

		// ApplicationContext ac = new
		// ClassPathXmlApplicationContext("employeeconfig.xml");

		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("employeeconfig.xml");
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		// Object ob = ac.getBean("empObj");

		Employee em = (Employee) ac.getBean("empObj");
		System.out.println(em);

	}
}

package com.masai.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
		
		Collage collage=(Collage)context.getBean("collage");
		collage.showDetails();

	}

}

package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alfhaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = theCoach == alfhaCoach;
		
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for the theCoach: " + theCoach);
		
		System.out.println("\nMemory location for the alfhaCoach: " + alfhaCoach);
		
		context.close();
	}
}

package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring conf file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml"); 
		//retrive bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		
		//lets's call our new method
		System.out.println(theCoach.getDailyFortune());
		//close the context
		context.close();
	}

}

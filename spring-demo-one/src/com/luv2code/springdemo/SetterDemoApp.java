package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//load spring conf file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrive bean
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		//call method
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//call our new literal values
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
		//close the context
		context.close();
	}

}

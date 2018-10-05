package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier(value ="randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constryctor");
	}
	//define init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach inside doMyStartupStuff ");
	}
	//
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach inside doMyCleanupStuff ");
	}
	//setter method
/*	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");

		this.fortuneService = fortuneService;
	}*/
	
/*	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

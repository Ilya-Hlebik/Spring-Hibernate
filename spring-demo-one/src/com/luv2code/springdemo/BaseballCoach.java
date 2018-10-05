package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	//defina a privete filed for the dependency
	private FortuneService fortuneService;
	
	//define constractor
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		//use my fortune service
		return fortuneService.getFortune();
	}
}

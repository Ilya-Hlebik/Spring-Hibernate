package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	// define constractor
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	//add init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	//add destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}
}

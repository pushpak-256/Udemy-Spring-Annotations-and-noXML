package com.pushpak.springDemo.Coaches;

import com.pushpak.springDemo.Fortune.FortuneService;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService ;
	
	//Constructor
	public SwimCoach (FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 1k meter as a warm-up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}

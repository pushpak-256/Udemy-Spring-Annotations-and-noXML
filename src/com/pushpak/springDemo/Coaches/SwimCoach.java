package com.pushpak.springDemo.Coaches;

import org.springframework.beans.factory.annotation.Value;

import com.pushpak.springDemo.Fortune.FortuneService;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService ;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

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

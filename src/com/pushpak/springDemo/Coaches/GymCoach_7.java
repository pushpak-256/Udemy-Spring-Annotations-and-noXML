package com.pushpak.springDemo.Coaches;

import org.springframework.beans.factory.annotation.Value;

import com.pushpak.springDemo.Fortune.FortuneService;

public class GymCoach_7 implements Coach {

	 
	private FortuneService fortuneService;
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Stretch for 5 min ";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}

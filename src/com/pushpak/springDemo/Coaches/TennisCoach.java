package com.pushpak.springDemo.Coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pushpak.springDemo.Fortune.FortuneService;

@Component
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;

	// constructor //constructor Injection
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "{ TT } " + " Do 30 min Running ";
	}

	@Override
	public String getDailyFortune() {
		return "{ TT } " + fortuneService.getDailyFortune();

	}

}

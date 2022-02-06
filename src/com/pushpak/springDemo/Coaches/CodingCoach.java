package com.pushpak.springDemo.Coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pushpak.springDemo.Fortune.FortuneService;

@Component
public class CodingCoach implements Coach {
  
	private FortuneService fortuneService;
	
	//setterInjection
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside setter");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "{cc} "+"Do coding for atleat 3 hours daily.";
	}

	@Override
	public String getDailyFortune() {
		return "{cc}"+fortuneService.getDailyFortune();
	}

	public CodingCoach(FortuneService fortuneService) {
		System.out.println("arg Constructor called");
	}

	public CodingCoach() {
		System.out.println("no-arg Constructor called");
	}

	
}

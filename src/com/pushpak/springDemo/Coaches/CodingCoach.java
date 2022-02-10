package com.pushpak.springDemo.Coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.pushpak.springDemo.Fortune.FortuneService;

@Component
public class CodingCoach implements Coach {

	private FortuneService fortuneService;

	// setterInjection
	// method Injection (with any name to Setter method)
	@Autowired @Qualifier("activity#5")
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println("{CC}  inside doSomeCrazyStuff");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "{cc} " + "Do coding for atleat 3 hours daily.";
	}

	@Override
	public String getDailyFortune() {
		return "{cc} " + fortuneService.getDailyFortune();
	}

	public CodingCoach(FortuneService fortuneService) {
		System.out.println("arg Constructor called");
	}

	public CodingCoach() {
		System.out.println("{CC } no-arg Constructor called");
	}

}

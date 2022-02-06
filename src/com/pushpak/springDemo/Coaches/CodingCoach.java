package com.pushpak.springDemo.Coaches;

import org.springframework.stereotype.Component;

@Component
public class CodingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "{cc} "+"Do coding for atleat 3 hours daily.";
	}

}

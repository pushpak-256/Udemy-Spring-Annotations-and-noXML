package com.pushpak.springDemo.Coaches;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "{ TT } "+" Do 30 min Running ";
	}

}

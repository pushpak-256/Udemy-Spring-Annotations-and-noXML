package com.pushpak.springDemo.Fortune;

public class SadFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Today is Sad Day";
	}

}

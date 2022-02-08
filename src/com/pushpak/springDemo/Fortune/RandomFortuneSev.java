package com.pushpak.springDemo.Fortune;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneSev implements FortuneService {

	String fortuneMessages[] = new String[] { "Just Do It ", "Good Day", "Never Give Up" };

	Random r = new Random();
	int index = r.nextInt(fortuneMessages.length);

	@Override
	public String getDailyFortune() {
		return "{random} "+fortuneMessages[index];
	}

}

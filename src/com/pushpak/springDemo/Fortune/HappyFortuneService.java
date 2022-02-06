package com.pushpak.springDemo.Fortune;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "{HapppyFortuneService }"+" Good Luck !";
	}

}

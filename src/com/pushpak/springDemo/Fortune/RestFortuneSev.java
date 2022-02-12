package com.pushpak.springDemo.Fortune;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneSev implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Reset Saturday- Sunday";
	}

}

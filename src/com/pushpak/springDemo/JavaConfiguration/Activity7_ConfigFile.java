package com.pushpak.springDemo.JavaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.pushpak.springDemo.Coaches.Coach;
import com.pushpak.springDemo.Coaches.GymCoach_7;
import com.pushpak.springDemo.Fortune.FortuneService;
import com.pushpak.springDemo.Fortune.RestFortuneSev;

@Configuration
@PropertySource("classpath:sport.properties")
public class Activity7_ConfigFile {

	// Create GymCoach Bean , Inject Dependency
	@Bean("gymCoach")
	public Coach getGymCoach() {
		GymCoach_7 g = new GymCoach_7();

		// using setter Injection
		g.setFortuneService(restFortuneSev());
		return g;
	}

	@Bean
	public FortuneService restFortuneSev() {
		return new RestFortuneSev();
	}

}

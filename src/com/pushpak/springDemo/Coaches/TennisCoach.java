package com.pushpak.springDemo.Coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.pushpak.springDemo.Fortune.FortuneService;

@Component
public class TennisCoach implements Coach {

	@Autowired @Qualifier("randomFortuneSev")
	private FortuneService fortuneService;

	// constructor //constructor Injection  //we cant use @Qualifier with Constructor
//	@Autowired 
//	public TennisCoach(@Qualifier("randomFortuneSev")FortuneService fortuneService) {
//		System.out.println("{Tennis} arg Constructor");
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
	
	//FIELDs for (Literal Injection) Using .properties file
	@Value("${foo.team}")
	private String team ;
	@Value("${foo.email}")
	private String email;
	
    //getters for literals
	public String getTeam() {
		return team;
	}

	public String getEmail() {
		return email;
	}


}

package com.pushpak.springDemo.Coaches;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
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
	
	public TennisCoach() {
		System.out.println("{Tennis} no-arg Constructor");
	}
	
   //define my Init Method
	@PostConstruct
	public void doMystartupStuff() {
		System.out.println("{TT} init , called after constructor and Dependency Injections");
	}
	
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("{TT} destroy , called before Bean Destroyed");
	}
	
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

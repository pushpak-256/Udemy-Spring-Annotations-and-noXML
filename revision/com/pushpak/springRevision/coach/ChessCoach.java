package com.pushpak.springRevision.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.pushpak.springRevision.fortuneServices.FortuneService;

@Component
public class ChessCoach implements Coach
{
    private FortuneService fortuneService;
    
    @Value("${foo.email}")
    private String email;
    
    @Value("${foo.team}")
    private String team;
    
    public String getEmail()
    {
        return email;
    }

    public String getTeam()
    {
        return team;
    }

    
     //Constructor
    public ChessCoach() {
       System.out.println("Inside ChessCoach");
    }

    @Autowired
    //setterInjection Without setter method as name 
    public void doSomeMapping (@Qualifier("luckyFortune") FortuneService fortuneService) 
    {
	this.fortuneService=fortuneService;
    }
    
    @Override
    public String getDailyWorkOut()
    {
	return "{chess} Meditate 10 min";
    }

    @Override
    public String getDailyFortune()
    {
	return fortuneService.getDailyFortune();
    }

}

package com.pushpak.springRevision.coach;

import org.springframework.stereotype.Component;

import com.pushpak.springRevision.fortuneServices.FortuneService;

@Component("boxing")
public class BoxingCoach implements Coach
{
    private FortuneService fortuneService;
    
    public BoxingCoach(FortuneService fortuneService) {
	System.out.println("Inside Boxing , constructor Injection");
	this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut()
    {
	return "{boxing} hit 100 punches";
    }

    @Override
    public String getDailyFortune()
    {
	return "{boxing}"+fortuneService.getDailyFortune();
    }

}

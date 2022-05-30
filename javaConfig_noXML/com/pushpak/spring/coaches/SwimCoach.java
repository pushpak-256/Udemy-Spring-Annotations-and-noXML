package com.pushpak.spring.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pushpak.spring.fortunes.FortuneService;


@Component
public class SwimCoach implements Coach
{

    private FortuneService fortuneService;
    
    public SwimCoach(@Autowired  FortuneService fortuneService) {
	this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut()
    {
	return "Swim 1000 meter as a Work-out";
    }

    @Override
    public String getDailyFortune()
    {
	return fortuneService.getDailyFortune();
    }
}
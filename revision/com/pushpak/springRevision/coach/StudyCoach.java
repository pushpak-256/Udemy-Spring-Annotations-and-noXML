package com.pushpak.springRevision.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pushpak.springRevision.fortuneServices.FortuneService;

@Component // if id not specified for this.bean , default will be class name starting with lower case
public class StudyCoach implements Coach
{

    //setter Injection
    private FortuneService fortuneService;
    
    @Autowired   //method name can be anything , doSomeCrazyStuff etc
    public void setFortuneService(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut()
    {
	return "{study} Read for 10 min";
    }

    @Override
    public String getDailyFortune()
    {
	return "{studyCoach}"+fortuneService.getDailyFortune();
    }

}

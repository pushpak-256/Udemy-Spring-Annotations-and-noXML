package com.pushpak.springRevision.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.pushpak.springRevision.fortuneServices.FortuneService;

@Scope("prototype")
@Component // if id not specified for this.bean , default will be class name starting with lower case
public class StudyCoach implements Coach
{

    //setter Injection
    private FortuneService fortuneService;
    
    @Autowired   //method name can be anything , doSomeCrazyStuff etc
    @Qualifier("randomFortuneService") //telling container which implementation we want
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

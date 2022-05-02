package com.pushpak.springRevision.fortuneServices;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService
{

    @Override
    public String getDailyFortune()
    {
	return "{random fort.} Hope you find random-things";
    }

}

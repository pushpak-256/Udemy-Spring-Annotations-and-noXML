package com.pushpak.springRevision.fortuneServices;

import org.springframework.stereotype.Component;

@Component
public class LuckyFortune implements FortuneService
{

    @Override
    public String getDailyFortune()
    {
	return "{Lucky} Today is your Lucky Day !";
    }

}

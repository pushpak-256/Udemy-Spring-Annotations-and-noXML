package com.pushpak.spring.fortunes;


public class SadFortuneService implements FortuneService
{

    @Override
    public String getDailyFortune()
    {
	 return "Today is a sad day";
    }

}

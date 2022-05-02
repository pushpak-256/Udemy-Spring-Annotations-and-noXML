package com.pushpak.springRevision.coach;

import org.springframework.stereotype.Component;

@Component("boxing")
public class BoxingCoach implements Coach
{

    @Override
    public String getDailyWorkOut()
    {
	return "{boxing} hit 100 punches";
    }

}

package com.pushpak.springRevision.coach;

import org.springframework.stereotype.Component;

@Component // if id not specified for this.bean , default will be class name starting with lower case
public class StudyCoach implements Coach
{

    @Override
    public String getDailyWorkOut()
    {
	return "{study} Read for 10 min";
    }

    @Override
    public String getDailyFortune()
    {
	return null;
    }

}

package com.pushpak.springRevision;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pushpak.springRevision.coach.Coach;

public class App
{

    public static void main(String[] args)
    {
	ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContextRev.xml");
	
	Coach c1 = context.getBean("boxing",Coach.class );
	Coach c2 = context.getBean("studyCoach",Coach.class);
	
	System.out.println("Workout :"+c1.getDailyWorkOut());
	System.out.println("Workout :"+c2.getDailyWorkOut());
	
	System.out.println("\nFortune :"+c1.getDailyFortune());
       
	context.close();
    }

}

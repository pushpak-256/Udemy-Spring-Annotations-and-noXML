package com.pushpak.springRevision;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pushpak.springRevision.coach.ChessCoach;
import com.pushpak.springRevision.coach.Coach;

public class App
{

    public static void main(String[] args)
    {
	ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContextRev.xml");
	
	Coach c1 = context.getBean("boxing",Coach.class );
	Coach c2 = context.getBean("studyCoach",Coach.class);
	Coach c3 = context.getBean("studyCoach",Coach.class);
	ChessCoach chessCoach = context.getBean("chessCoach",ChessCoach.class);
	
	System.out.println("Workout :"+c1.getDailyWorkOut());
	System.out.println("Workout :"+c2.getDailyWorkOut());
	System.out.println("Workout :"+chessCoach.getDailyWorkOut());
	
	System.out.println("\nFortune :"+c1.getDailyFortune());
	System.out.println("Fortune :"+c2.getDailyFortune());
	System.out.println("Fortune :"+chessCoach.getDailyFortune());
       
	//literal Injection Demo
	System.out.println("\nTeam"+chessCoach.getTeam());
	System.out.println("\nEmail"+chessCoach.getEmail());
	
	//bean Scope Test // StudyCoach Scope changed to  prototype
	System.out.println("\nAre Study Coach Objects same : "+(c2==c3));
	context.close();
    }

}

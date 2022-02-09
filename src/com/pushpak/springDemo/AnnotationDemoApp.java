package com.pushpak.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pushpak.springDemo.Coaches.Coach;
import com.pushpak.springDemo.Coaches.TennisCoach;

public class AnnotationDemoApp {

	public static void main(String[] args) {
    
	//1. Load spring config file
		ClassPathXmlApplicationContext context
		= new ClassPathXmlApplicationContext("applicationContext.xml");
		
	//2. Retrive Bean from Spring config File
		TennisCoach theCoach  =context.getBean("tennisCoach",TennisCoach.class);
		
	//3. Use Bean, methods
		System.out.println(theCoach.getDailyWorkout()+"\n"+theCoach.getDailyFortune());
		System.out.println("{TT} Team :- "+theCoach.getTeam()+"\t Email :- "+theCoach.getEmail());
		
		
		//practiceActivity#4
		Coach codingCoach = context.getBean("codingCoach",Coach.class);
		System.out.println("\n"+codingCoach.getDailyWorkout()+"\n"+codingCoach.getDailyFortune());
		
	//4. Close Context
		context.close();
	}

}

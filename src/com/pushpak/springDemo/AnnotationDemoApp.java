package com.pushpak.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pushpak.springDemo.Coaches.Coach;

public class AnnotationDemoApp {

	public static void main(String[] args) {
    
	//1. Load spring config file
		ClassPathXmlApplicationContext context
		= new ClassPathXmlApplicationContext("applicationContext.xml");
		
	//2. Retrive Bean from Spring config File
		Coach theCoach  =context.getBean("tennisCoach",Coach.class);
		
	//3. Use Bean, methods
		System.out.println(theCoach.getDailyWorkout()+"\n"+theCoach.getDailyFortune());
		
		//practiceActivity#4
		Coach codingCoach = context.getBean("codingCoach",Coach.class);
		System.out.println("\n"+codingCoach.getDailyWorkout());
		
	//4. Close Context
		context.close();
	}

}

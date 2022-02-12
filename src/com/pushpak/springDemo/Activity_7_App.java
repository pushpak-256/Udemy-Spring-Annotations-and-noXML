package com.pushpak.springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pushpak.springDemo.Coaches.GymCoach_7;
import com.pushpak.springDemo.JavaConfiguration.Activity7_ConfigFile;

public class Activity_7_App {

	public static void main(String[] args) {
		
		//Load Container
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(Activity7_ConfigFile.class);
		
//		retrive Bean
		GymCoach_7 coach = context.getBean("gymCoach",GymCoach_7.class);
		
//		call methods
		System.out.println(coach.getDailyWorkout()+"\t"+coach.getDailyFortune());
		System.out.println(coach.getEmail()+"\t"+coach.getTeam());
		
//		close context
		context.close();
	}

}

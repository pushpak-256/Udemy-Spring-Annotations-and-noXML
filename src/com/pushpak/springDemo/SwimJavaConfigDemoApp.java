package com.pushpak.springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pushpak.springDemo.Coaches.Coach;
import com.pushpak.springDemo.Coaches.TennisCoach;
import com.pushpak.springDemo.JavaConfiguration.SportConfig;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// 1. Load spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// 2. Retrive Bean from Spring config File
		Coach theCoach = context.getBean("swimCoach", Coach.class);

		// 3. Use Bean, methods
		System.out.println(theCoach.getDailyWorkout() + "\n" + theCoach.getDailyFortune());

		// 4. Close Context
		context.close();
	}

}

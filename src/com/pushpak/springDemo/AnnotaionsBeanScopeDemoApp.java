package com.pushpak.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pushpak.springDemo.Coaches.Coach;

public class AnnotaionsBeanScopeDemoApp {

	public static void main(String[] args) {
           //load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrive bean
		Coach coach1= context.getBean("tennisCoach",Coach.class);
		Coach coach2= context.getBean("tennisCoach",Coach.class);
		
		//check if they are same (same memory location or address)
		boolean res = (coach1==coach2);
		
		//printout result
		System.out.println("\nPointing to the same object: "+res);
		System.out.println("\nMemory loc for coach1: ("+coach1+")");
		System.out.println("Memory loc for coach2: ("+coach2+")\n");
		
		//close context 
		context.close();
		
		
	}

}

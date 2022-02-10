package com.pushpak.springDemo.Fortune;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.ResourceBundle;


import org.springframework.stereotype.Component;

@Component("activity#5")
public class Activity5_FortuneService implements FortuneService {
	
	LinkedList<String> ll=null;
	int i=0;
	
	public Activity5_FortuneService() {
		// will load Fortune form file when bean is created
		getFortuneList();
	}

	public void getFortuneList() {
	ResourceBundle rb = ResourceBundle.getBundle("fortune"); // prop.properties

		Iterator<String> fortune = rb.getKeys().asIterator();
		 ll = new LinkedList<>();

		while (fortune.hasNext()) {
			ll.add(rb.getString(fortune.next()));
		}
		Random r = new Random();
		 i= r.nextInt(ll.size());
	}
	
	@Override
	public String getDailyFortune() {
		return "{activity#5}"+ll.get(i);
	}

}

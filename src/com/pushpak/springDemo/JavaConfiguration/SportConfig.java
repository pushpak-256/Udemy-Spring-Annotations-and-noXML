package com.pushpak.springDemo.JavaConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import com.pushpak.springDemo.Coaches.Coach;
import com.pushpak.springDemo.Coaches.SwimCoach;
import com.pushpak.springDemo.Fortune.FortuneService;
import com.pushpak.springDemo.Fortune.SadFortuneService;
import com.pushpak.springDemo.LoggerFiles.MyLoggerConfiguration;

@Configuration
@PropertySource("classpath:mylogger.properties")
@PropertySource("classpath:sport.properties")
//@ComponentScan("com.pushpak.springDemo")
public class SportConfig {

	@Bean
	public MyLoggerConfiguration myLoggerConfig(@Value("${root.logger.level}") String rootLoggerLevel,
										 @Value("${printed.logger.level}") String printedLoggerLevel) {
		MyLoggerConfiguration myLoggerConfig = new MyLoggerConfiguration(rootLoggerLevel, printedLoggerLevel);
		return myLoggerConfig;
	}
 
	//Define Bean for SadFortuneService  //Method name == Bean ID
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	//Define Bean for SwimCoach and Inject Dependency
	@Bean 
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

	
	
}

package com.pushpak.springDemo.JavaConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.pushpak.springDemo.LoggerFiles.MyLoggerConfig;
import com.pushpak.springDemo.LoggerFiles.MyLoggerConfiguration;

@Configuration
@PropertySource("classpath:mylogger.properties")
@ComponentScan("com.pushpak.springDemo")
public class SportConfig {
 
	@Bean
	public MyLoggerConfiguration myLoggerConfig(@Value("${root.logger.level}") String rootLoggerLevel,
										 @Value("${printed.logger.level}") String printedLoggerLevel) {
 
		MyLoggerConfiguration myLoggerConfig = new MyLoggerConfiguration(rootLoggerLevel, printedLoggerLevel);
 
		return myLoggerConfig;
	}
 
//	// define bean for our sad fortune service
//	@Bean
//	public FortuneService sadFortuneService() {
//		return new SadFortuneService();
//	}
// 
//	// define bean for our swim coach AND inject dependency
//	@Bean
//	public Coach swimCoach() {
//		SwimCoach mySwimCoach = new SwimCoach(sadFortuneService());
// 
//		return mySwimCoach;
//	}
 
}

package com.sourabh.code.springboothelloworldmaven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloControllerTestConfiguration {

	@Bean
	public HelloController helloController() {
		return new HelloController();
	}
}

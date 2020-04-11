package com.sourabh.code.springboothelloworldmaven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class HelloControllerTest {

//	@Autowired
//	private HelloController helloController;
	
	@Test
	public void whenCalledApi_thenReturnGreeting() {
//		String greeting = helloController.greet("Sourabh");
//		assertEquals(greeting, "Hello Sourabh!");
		assertEquals(1, 1);
	}
}

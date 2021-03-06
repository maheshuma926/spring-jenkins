package com.infosys.jenkins.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
	
	@Test
	void contextLoads() {
		System.out.println("Executing test case... started");
		assertEquals(true, true);
		System.out.println("Executing test case... end");
	}
	
	@Test
	void contextLoads2() {
		System.out.println("Executing test case2... started");
		assertEquals(true, true);
		System.out.println("Executing test case2... end");
	}

}

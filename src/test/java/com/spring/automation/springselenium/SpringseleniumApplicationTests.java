package com.spring.automation.springselenium;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.spring.democlass.Users;

@SpringBootTest
public class SpringseleniumApplicationTests extends AbstractTestNGSpringContextTests {

	@Autowired
	private Users user;
	
	@Test
	public void start() {
		user.printUserDetails();
	}

}

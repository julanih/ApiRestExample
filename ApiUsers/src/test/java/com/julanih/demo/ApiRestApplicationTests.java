package com.julanih.demo;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApiRestApplicationTests {

	@Test
	void contextLoads() {
		assertFalse(ApiRestApplicationTests.class.isInstance(getClass()));
	}

}
package com.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkins2ApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(SpringJenkins2ApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("test case exceuting");
		assertEquals(true,true);
	}

}


package com.fadedblack.money_tracker;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
		"springdoc.api-docs.enabled=false",
		"springdoc.swagger-ui.enabled=false"
})
class MoneyTrackerApplicationTests {

	@Test
	void contextLoads() {
	}

}

package com.app.distanceCalculator;

import com.app.distanceCalculator.entities.DistanceEntity;
import com.app.distanceCalculator.services.AddDistanceService;
import com.app.distanceCalculator.services.PingService;
import com.app.distanceCalculator.utilities.EUnitOfDistance;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
class DistanceCalculatorApplicationTests {

	@Autowired
	PingService pingService;

	@Test
	void pingServiceTest() {
		Assertions.assertNotNull(pingService.retrievePing());
		System.out.println(EUnitOfDistance.METERS.toString());
	}

	@Test
	void contextLoads() {
	}

}

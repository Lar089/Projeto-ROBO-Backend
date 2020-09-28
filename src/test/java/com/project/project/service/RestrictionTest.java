/**
package com.project.project.service;


import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.project.service.Restriction;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class RestrictionTest {
	
	@Autowired
	private Restriction serviceImplamentation;
	
	@Test
	public void movementInvalidTest() {
		boolean result_expected = serviceImplamentation.movementInvalid(0, 2);
		assertTrue(result_expected);
		
	}
	
	@Test
	public void nextMovementTest() {
		boolean result_expected = serviceImplamentation.nextMovement(0, 1);
		assertTrue(result_expected);
		
	}
	
	@Test
	public void movementPulseTest() {
		boolean result_expected = serviceImplamentation.movementPulse(3, 4);
		assertTrue(result_expected);
		
	}
	
	@Test
	public void movementRotationTest() {
		boolean result_expected = serviceImplamentation.movementRotation(0, 1);
		assertTrue(result_expected);
		
	}
	

}*/

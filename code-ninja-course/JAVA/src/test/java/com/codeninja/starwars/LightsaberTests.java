package com.codeninja.starwars;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class LightsaberTests {

	private Lightsaber ls;

	@Test
	public void when_create_then_status_is_not_on() {
		ls = new Lightsaber();
		assertFalse(ls.isOn());
	}

	@Test
	public void when_turnon_then_status_is_on() {
		ls = new Lightsaber();
		ls.turnOn();
		assertTrue(ls.isOn());
 	}
	
	

}

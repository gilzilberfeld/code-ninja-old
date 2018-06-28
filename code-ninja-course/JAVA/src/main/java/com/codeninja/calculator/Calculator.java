package com.codeninja.calculator;

public class Calculator {
	String storedValue="";
	
	public void press(String key) {
		if (key != "0")
		{
			storedValue += key;
		}
		else
			storedValue = key;
	}

	public String getDisplay() {
		return storedValue;
	}
	
}

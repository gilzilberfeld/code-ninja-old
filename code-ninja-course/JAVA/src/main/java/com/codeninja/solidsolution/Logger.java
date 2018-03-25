package com.codeninja.solidsolution;

public class Logger {
	public static void log(String message, String param) {
		String messageWithParam = "Log: " + message + " %s";
		System.out.printf(message ,param);
	}
}

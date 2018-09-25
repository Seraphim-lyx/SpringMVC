package com.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogTest {

	private static final Logger rootLogger = LogManager.getRootLogger();

	public static void main(String[] args) {
		rootLogger.error("Logged by root logger: Hello this is an error");
		rootLogger.info("Logged by root logger: Hello World!");
		rootLogger.debug("Logged by root logger: Hello debug message.");
	}

}

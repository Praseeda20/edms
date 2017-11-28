package com.test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLogger {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(TestLogger.class);
		PropertyConfigurator.configure("resources/log4j.properties");
		logger.debug("debug message");
		logger.info("info message");
		logger.warn("warn message");
		logger.error("error message");
		logger.fatal("fatal message");
		
		
		
	}
}

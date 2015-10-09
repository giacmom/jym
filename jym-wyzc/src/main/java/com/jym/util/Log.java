package com.jym.util;

import org.apache.log4j.Logger;

public class Log {
	
	static Logger logger = null;
	
	public static void debug(
			Class<?> c, 
			final String debugMessage){
		logger = Logger.getLogger(c.getName());
		logger.debug(debugMessage);
	}
	
	public static void error(
			Class<?> c, 
			final String debugMessage){
		logger = Logger.getLogger(c.getName());
		logger.error(debugMessage);
	}
	
	public static void info(
			Class<?> c, 
			final String debugMessage){
		logger = Logger.getLogger(c.getName());
		logger.info(debugMessage);
	}
}

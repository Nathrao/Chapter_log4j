package com.javarider;

import org.apache.log4j.Logger;

public class MyAppLogs {
		   private static org.apache.log4j.Logger log = Logger.getLogger(MyAppLogs.class);
		   
		   public static void main(String[] args) {
		   
		      log.trace("Trace Message!");
		      log.debug("Debug Message!");
		      log.info("Info Message!");
		      log.warn("Warn Message!");
		      log.error("Error Message!");
		      log.fatal("Fatal Message!");
		   }
}

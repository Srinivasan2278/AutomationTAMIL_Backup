package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyConfiguratorExample {

	static	Logger logger = Logger.getLogger(PropertyConfiguratorExample.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("this is debug message");
		logger.info("this is info message");
		logger.warn("this is warn message");
		logger.error("this is error message");
		logger.fatal("this is fatal message");

	}

}

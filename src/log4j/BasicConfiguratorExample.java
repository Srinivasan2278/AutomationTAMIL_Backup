package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class BasicConfiguratorExample {
		
			static	Logger logger = Logger.getLogger(BasicConfiguratorExample.class);
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		BasicConfigurator.configure();
		logger.debug("this is debug message");
		logger.info("this is info message");
		logger.warn("this is warn message");
		logger.error("this is error message");
		logger.fatal("this is fatal message");
		
	}

}

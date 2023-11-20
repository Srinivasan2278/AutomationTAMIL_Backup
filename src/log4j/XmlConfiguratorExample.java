package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

public class XmlConfiguratorExample {

	static	Logger logger = Logger.getLogger(XmlConfiguratorExample.class);
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		DOMConfigurator.configure("log4j.properties");
		logger.debug("this is debug message");
		logger.info("this is info message");
		logger.warn("this is warn message");
		logger.error("this is error message");
		logger.fatal("this is fatal message");

	}

}

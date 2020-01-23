package com.logs4j.examp;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
public class LoggesExamp {
	static final Logger logger = Logger.getLogger(LoggesExamp.class);
	 
    public static void main(String[] args)
    {
        //Configure logger
        BasicConfigurator.configure();
        logger.debug("Hello World!");
        logger.info("Hello");
    }
}

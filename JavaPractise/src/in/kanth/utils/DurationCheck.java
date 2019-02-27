package in.kanth.utils;

import java.time.Duration;

import org.apache.log4j.Logger;

import in.kanth.multiThreading.ExecutorCheck;

public class DurationCheck {

	public final static Logger logger = Logger.getLogger(DurationCheck.class);
	
	public static void main(String[] args) {
	
		Duration d1=Duration.ofNanos(Long.MAX_VALUE);
		logger.info(Long.MAX_VALUE);
		logger.info(d1.getSeconds()/3600);
	}

}

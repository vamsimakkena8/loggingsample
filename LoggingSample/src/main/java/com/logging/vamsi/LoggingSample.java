/**
 * 
 */
package com.logging.vamsi;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




/**
 * @author santoshkarla
 *
 */
public class LoggingSample {

	/**
	 * @param args
	 */
	private static Logger logger = LoggerFactory.getLogger(LoggingSample.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintDate();
		

	}
	
	private static void PrintDate(){
		SimpleDateFormat simpleDateFormat = null;
		String date = null;
		try{
			//Date testDate = new Date();
			
			logger.info("Getting the current date");
			simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
			date =simpleDateFormat.format(new Date());
			logger.info("Current date format {}", date);
		}catch (Exception ex){
			logger.error("Error parsing date to simple date format - {}", ex);
		}
		 
		
	}

}

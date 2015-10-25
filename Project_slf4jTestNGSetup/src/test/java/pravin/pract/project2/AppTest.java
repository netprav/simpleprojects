package pravin.pract.project2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.Level;

/**
 * Unit test for simple App.
 */

public class AppTest 
{
	Logger log = LoggerFactory.getLogger(AppTest.class.getSimpleName());
    /**
     * Create the test case
     */
	@Test
	public void testIfAdditionHandlesPositiveSums(){
		App app = new App();
		int total = app.add(2,3);
		Assert.assertEquals(5, total);
		log.debug("addition is {}", total );
		System.out.printf("addition is %d", total );
	}
	
	/*
	// using core java logging framework without using any other libraries
	@Test
	public void testIfAdditionHandlesPositiveSumsUsingJavaLogging(){
		java.util.logging.Logger logger = Logger.getLogger(ListPractice.class.getCanonicalName());
        java.util.logging.ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        logger.addHandler(consoleHandler);
        logger.setLevel(Level.ALL);
		
		App app = new App();
		int total = app.add(2,3);
		Assert.assertEquals(5, total);
		logger.log(Level.debug, "addition is " + total);
		System.out.printf("addition is %d", total );
	}
	
	
	*/

}

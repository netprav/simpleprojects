package pravin.pract.project2;

import javafx.util.Pair;
import org.mockito.stubbing.Answer;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.Level;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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

	@Test
	public void mockitoTestToSeeMavenDependencyWorksCorrectly(){
		// Given
		App mockApp = mock(App.class);
		Pair pair1 = new Pair(2,5);
		Pair pair2 = new Pair(-22,5);
		Integer ans1 = new Integer(7);
		Integer ans2 = new Integer(17);

		// When
		when(mockApp.add(2, 7)).thenReturn(ans1);
		when(mockApp.add(-22, 5)).thenReturn(ans2);

		Assert.assertEquals(7,mockApp.add(2,7));
		Assert.assertEquals(17,mockApp.add(-22,5));

	}
	

	// using core java logging framework without using any other libraries
	@Test
	public void testIfAdditionHandlesPositiveSumsUsingJavaLogging(){
		java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AppTest.class.getCanonicalName());
        //java.util.logging.ConsoleHandler consoleHandler = new java.util.logging.ConsoleHandler();
        //consoleHandler.setLevel(Level.ALL);
        //logger.addHandler(consoleHandler);
        logger.setLevel(Level.ALL);
		
		App app = new App();
		int total = app.add(2,3);
		Assert.assertEquals(5, total);
		logger.log(Level.INFO, "addition is " + total);
		System.out.printf("addition is %d", total );
	}
	
	


}

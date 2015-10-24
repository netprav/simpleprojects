package pravin.pract.project2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


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

}

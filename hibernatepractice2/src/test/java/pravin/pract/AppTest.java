package pravin.pract;

import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by bharati on 26/10/2015.
 */
public class AppTest {
    private static Logger logger = Logger.getLogger(AppTest.class.getName());
    static{
        logger.setLevel(Level.ALL);
    }

    @Test
    public void testAddFunction(){
        App app = new App();
        Assert.assertEquals( 7, app.add(5,2));
        logger.log(Level.INFO, "testAddFunction completed");
    }

}

package pkg1;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by bharati on 27/10/2015.
 */
public class AppTest {
    static Logger logger = Logger.getLogger(AppTest.class.getName());
    static{
        logger.setLevel(Level.ALL);
    }

    @Test(enabled = true)
    public void AppTest(){
        logger.log(Level.INFO, "Running AppTest");
        assertEquals(11, new App().add(4, 7));
        logger.log(Level.INFO, "AppTest Finished");

    }
}

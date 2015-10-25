package pravin.pract;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class, AppTest1.class, AppTest2.class
                            //    ,MessageUtilsTest2.class  // this is wrong does not extend testcase
                            //    ,MessageUtilsTest1.class   // this is wrong, as utilstest class do not extend testcase
                            );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        for(int i=0; i<20; i++)
        System.out.println("Inside testApp()");
        assertTrue( true );
    }


    public void testDivisionWithException() {
        for(int i=0; i<20; i++)
        System.out.println("Inside testDivisionWithException()");
        try {
            int i = 1 / 0;
            fail();
        }catch (ArithmeticException ex){
            ; // ignore - this is correct
        }
    }
}

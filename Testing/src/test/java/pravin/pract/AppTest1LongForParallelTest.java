package pravin.pract;

import junit.framework.TestCase;

/**
 * Created by bharati on 10/25/2015.
 */
public class AppTest1LongForParallelTest
        extends TestCase {

    public AppTest1LongForParallelTest(String name){
        super(name);
    }

    public void testAppTest11Something(){
        for(int i=0; i<200; i++)
            System.out.println("inside testAppTest11Something");
        assertTrue(true);
    }

    public void testAppTest12Something(){
        for(int i=0; i<200; i++)
            System.out.println("inside testAppTest12Something");
        assertTrue(true);
    }

    public void testAppTest13Something(){
        for(int i=0; i<200; i++)
            System.out.println("inside testAppTest13Something");
        assertTrue(true);
    }


}

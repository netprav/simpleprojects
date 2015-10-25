package pravin.pract;

/**
 * Created by bharati on 10/25/2015.
 */

import junit.framework.TestCase;

/**
 * Created by bharati on 10/25/2015.
 */
public class AppTest2LongForParallelTest
        extends TestCase {

    public AppTest2LongForParallelTest(String name){
        super(name);
    }

    public void testAppTest21Something(){
        for(int i=0; i<200; i++)
        System.out.println("inside testAppTest21Something");
        assertTrue(true);
    }

    public void testAppTest22Something(){
        for(int i=0; i<200; i++)
            System.out.println("inside testAppTest22Something");
        assertTrue(true);
    }

    public void testAppTest23Something(){
        for(int i=0; i<200; i++)
            System.out.println("inside testAppTest23Something");
        assertTrue(true);
    }

}

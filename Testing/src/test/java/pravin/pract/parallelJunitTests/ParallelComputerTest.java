package pravin.pract.parallelJunitTests;

import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;
import pravin.pract.AppTest1LongForParallelTest;
import pravin.pract.AppTest2LongForParallelTest;

/**
 * Created by bharati on 10/25/2015.
 */
public class ParallelComputerTest {

    @Test
    public void test() {
        Class[] cls={AppTest1LongForParallelTest.class,AppTest2LongForParallelTest.class };

        //Parallel among classes
        JUnitCore.runClasses(ParallelComputer.classes(), cls);

        //Parallel among methods in a class
        JUnitCore.runClasses(ParallelComputer.methods(), cls);

        //Parallel all methods in all classes
        JUnitCore.runClasses(new ParallelComputer(true, true), cls);
    }

    public static class ParallelTest1 {
        @Test public void a(){}
        @Test public void b(){}
    }

    public static class ParallelTest2 {
        @Test public void a(){}
        @Test public void b(){}
    }
}
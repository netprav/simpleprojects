package privateFieldTester;

import org.testng.Assert;
import org.testng.annotations.Test;
import pravin.pract.PrivateFieldsMethodsClass;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by bharati on 10/25/2015.
 */
public class PrivateFieldsMethodsClassTest {

    @Test
    public void checkIfPrivateFieldsMethodsAreAccessible(){
        try {
            Field f;
            // public fields can be fetched using getField (getField get accessible self or parent fields
            f = PrivateFieldsMethodsClass.class.getField("publicVar");
            System.out.println("Public Field: " + f);
            // f = PrivateFieldsMethodsClass.class.getField("privateString");  // This would fail,
                                                // can not use getField API call to fetch private fields
            f = PrivateFieldsMethodsClass.class.getDeclaredField("privateVar"); // getDeclaredField fetches private
            System.out.println("Private Field: " + f);
            f.setAccessible(true);  // make is accessible for variable f

            PrivateFieldsMethodsClass testObject = new PrivateFieldsMethodsClass();
            Object str = f.get(testObject);  // get the value of f into str,
            System.out.println("Private Field value for Test Object: " + str);
            f.set(testObject, "new value in private variable");
            testObject.printVariables();

            Method m; // ditto for methods, private & getDeclared logic
            m = PrivateFieldsMethodsClass.class.getDeclaredMethod("privateMethod");
            m.setAccessible(true);
            m.invoke(testObject);

        }catch(NoSuchFieldException ex){
            Assert.fail();
        }catch(NoSuchMethodException ex){
            Assert.fail();
        }catch(IllegalAccessException ex){
            Assert.fail();
        }catch(InvocationTargetException ex){
            Assert.fail();
        }

    }
}

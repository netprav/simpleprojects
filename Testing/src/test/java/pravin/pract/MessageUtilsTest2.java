package pravin.pract;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

/**
 * Created by bharati on 10/25/2015.
 */
public class MessageUtilsTest2 {
    String message = "Robert";
    MessageUtils messageUtil = new MessageUtils(message);

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertEquals(message,messageUtil.salutationMessage());
    }
}


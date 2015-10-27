package pkg1;

import com.jayway.restassured.response.Response;
import org.testng.annotations.Test;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.testng.Assert.*;

import static com.jayway.restassured.RestAssured.expect;
import static com.jayway.restassured.RestAssured.get;


/**
 * Created by bharati on 27/10/2015.
 */
public class OrdersTest {
    Logger logger = Logger.getLogger(OrdersTest.class.getCanonicalName());

    @Test(enabled=true)
    public void testOrderMenuIsNotNull(){
        assertTrue(new Orders().showMenu().contains("Chicken"));
        assertTrue(new Orders().showMenu().contains("Veg"));
    }

    @Test
    public void testWebServiceReturnsValue(){
        logger.setLevel(Level.ALL);
        Response response = get("/websvcalongwithtests/orders");
        logger.log(Level.INFO, response.getBody().toString());
        String str = response.getBody().asString();
        logger.log(Level.INFO, str);
        assertTrue(str.contains("Chicken"));
    }

        @Test(enabled = true)
        public void testOrdersAreGeneratedWithIncrementalId(){
            Random random = new Random();
            int orderCount = random.nextInt(100) + 5;
            for(int i=0; i<orderCount; i++)
                new Order("customer"+i, "SomeOrder");

            Order order = new Order("someCustomer", "someOrder");
            Order nextOrder = new Order("someCustomer", "someOrder");

            assertTrue((order.getOrderId()+1) == nextOrder.getOrderId());

        }

        public void testOrderCanBePlaced(){
            Orders orders = new Orders();
            String custName = "customer1";
            String orderItem = "Chicken Curry";
            Order order = new Order(custName, orderItem);
            //orders.placeOrder(custName, orderItem);
            //assertTrue(orders.getOrders().contains());
        }

}

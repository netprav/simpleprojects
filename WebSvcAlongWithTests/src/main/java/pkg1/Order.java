package pkg1;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by bharati on 27/10/2015.
 */
public class Order {
    static AtomicInteger orderIdGenerator = new AtomicInteger(101);
    private final int orderId;
    private final String customerName;
    private final String orderItem;

    Order(String customeName, String orderItem){
        orderId = orderIdGenerator.getAndIncrement();
        this.customerName = customeName;
        this.orderItem = orderItem;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getOrderItem() {
        return orderItem;
    }
}

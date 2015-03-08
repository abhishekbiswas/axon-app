package org.abhishek.axon.events;

/**
 * Created by abhishek on 09/03/15.
 */
public class OrderCompletedEvent {

    private final String orderId;

    public OrderCompletedEvent(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }
}
